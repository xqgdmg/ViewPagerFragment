package com.example.administrator.viewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();

    }

    private void initListener() {

    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        fragments = new ArrayList<Fragment>();
        fragments.add(new Fragment01());
        fragments.add(new Fragment02());
        fragments.add(new Fragment03());
        fragments.add(new Fragment04());
        fragments.add(new Fragment05());

        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager()));
    }


    private class MyFragmentPagerAdapter extends FragmentPagerAdapter {

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }


        //------------------------------------------------------

//        @Override
//        public int getCount() {
//            return fragments.size();
//        }

//        @Override
//        public boolean isViewFromObject(View view, Object object) {
//            return false;
//        }

//        @Override
//        public Object instantiateItem(ViewGroup container, int position) {
//            return fragments.get(position);
//        }

//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//            super.destroyItem(container, position, object);
//        }

//        @Override
//        public void destroyItem(View container, int position, Object object) {
//            super.destroyItem(container, position, object);
//        }

        //        @Override
//        public Object instantiateItem(View container, int position) {
//            return super.instantiateItem(container, position);
//        }
    }
}
