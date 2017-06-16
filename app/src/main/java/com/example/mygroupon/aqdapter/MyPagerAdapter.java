package com.example.mygroupon.aqdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mygroupon.fragment.FragmentA;
import com.example.mygroupon.fragment.FragmentB;
import com.example.mygroupon.fragment.FragmentC;
import com.example.mygroupon.fragment.FragmentD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarena on 2017/6/16.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList;

    public MyPagerAdapter(FragmentManager fm) {

        super(fm);
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new FragmentA());
        fragmentList.add(new FragmentB());
        fragmentList.add(new FragmentC());
        fragmentList.add(new FragmentD());
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
