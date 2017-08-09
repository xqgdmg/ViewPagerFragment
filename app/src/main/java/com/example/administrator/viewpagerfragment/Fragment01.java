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
 * Created by Chris on 2017/8/9.
 */

@SuppressLint("ValidFragment")
public class Fragment01 extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("chris","onCreateView 01");
        return inflater.inflate(R.layout.fragment01,null);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("chris","onCreate 01");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        Log.e("chris","onAttachContext 01");
        super.onAttach(context);
    }

    @Override
    public void onAttach(Activity activity) {
        Log.e("chris","onAttachActivity 01");
        super.onAttach(activity);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        Log.e("chris","onAttachFragment 01");
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e("chris","onActivityCreated 01");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e("chris","onStart 01");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("chris","onResume 01");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("chris","onPause 01");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("chris","onStop 01");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("chris","onDestroyView 01");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("chris","onDestroy 01");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e("chris","onDetach 01");
        super.onDetach();
    }
}
