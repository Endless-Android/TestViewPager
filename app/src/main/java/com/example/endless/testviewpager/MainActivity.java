package com.example.endless.testviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    @BindView(R.id.activity_main)
    LinearLayout mActivityMain;
    private MyAdapter mMyAdapter;
    private List<Fragment> list_title;
    private Fragment1 mFragment1;
    private Fragment2 mFragment2;
    private Fragment3 mFragment3;
    private Fragment4 mFragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mFragment1 = new Fragment1();
        mFragment2 = new Fragment2();
        mFragment3 = new Fragment3();
        mFragment4 = new Fragment4();
        list_title = new ArrayList<Fragment>();
        list_title.add(mFragment1);
        list_title.add(mFragment2);
        list_title.add(mFragment3);
        list_title.add(mFragment4);
        mMyAdapter = new MyAdapter(getSupportFragmentManager(), list_title);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mViewPager.setAdapter(mMyAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
