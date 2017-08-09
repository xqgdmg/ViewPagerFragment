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
 * Created by Chris on 2037/8/9.
 */

@SuppressLint("ValidFragment")
public class Fragment03 extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("chris","onCreateView03");
        return inflater.inflate(R.layout.fragment03,null);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("chris","onCreate 03");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        Log.e("chris","onAttachContext 03");
        super.onAttach(context);
    }

    @Override
    public void onAttach(Activity activity) {
        Log.e("chris","onAttachActivity 03");
        super.onAttach(activity);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        Log.e("chris","onAttachFragment 03");
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e("chris","onActivityCreated 03");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e("chris","onStart 03");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("chris","onResume 03");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("chris","onPause 03");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("chris","onStop 03");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("chris","onDestroyView 03");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("chris","onDestroy 03");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e("chris","onDetach 03");
        super.onDetach();
    }
}
