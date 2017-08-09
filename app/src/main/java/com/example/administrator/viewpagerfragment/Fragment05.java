package com.example.administrator.viewpagerfragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chris on 2057/8/9.
 */

@SuppressLint("ValidFragment")
public class Fragment05 extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("chris","onCreateView05");
        return inflater.inflate(R.layout.fragment05,null);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("chris","onCreate 05");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        Log.e("chris","onAttachContext 05");
        super.onAttach(context);
    }

    @Override
    public void onAttach(Activity activity) {
        Log.e("chris","onAttachActivity 05");
        super.onAttach(activity);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        Log.e("chris","onAttachFragment 05");
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e("chris","onActivityCreated 05");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e("chris","onStart 05");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("chris","onResume 05");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("chris","onPause 05");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("chris","onStop 05");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("chris","onDestroyView 05");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("chris","onDestroy 05");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e("chris","onDetach 05");
        super.onDetach();
    }
}
