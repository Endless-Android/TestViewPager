package com.example.endless.testviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/5/16.
 */

public class MyAdapter extends FragmentStatePagerAdapter {

    private String[] mTitles = new String[]{"首页", "发现", "进货单", "我的"};
    private List<Fragment> list_fragment;

    public MyAdapter(FragmentManager fm, List<Fragment> list_fragment) {
        super(fm);
        this.list_fragment = list_fragment;
    }

    @Override
    public Fragment getItem(int position) {
        return list_fragment.get(position % list_fragment.size());
    }

    @Override
    public int getCount() {
        return list_fragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position % mTitles.length];
    }
}
