package com.example.administrator.myapp.view.main.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> fragmentList;
    private List<String> list_title;

    public MainViewPagerAdapter(FragmentManager fm, Context context, List<Fragment> fragmentList) {
        super(fm);
        this.context = context;
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        Log.d("hahaha",fragmentList.size()+"");
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(list_title != null && position < list_title.size()){
            return list_title.get(position);
        }else{
            return super.getPageTitle(position);
        }
    }
}
