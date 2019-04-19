package com.example.administrator.myapp.view.main.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.administrator.myapp.R;
import com.example.administrator.myapp.base.BaseActivity;
import com.example.administrator.myapp.view.listen.fragment.ListenFragment;
import com.example.administrator.myapp.view.main.adapter.MainViewPagerAdapter;
import com.example.administrator.myapp.view.main.bean.MainBottomBean;
import com.example.administrator.myapp.view.main.fragment.HomeFragment;
import com.example.administrator.myapp.view.mine.fragment.MineFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    List<Fragment> list;
    List<MainBottomBean> mainBottomBeanList;
    @BindView(R.id.main_viewpager)
    ViewPager viewPager;
    @BindView(R.id.main_tablayout)
    TabLayout tabLayout;
    @Override
    protected void initView() {
        ButterKnife.bind(this);
        list = new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new ListenFragment());
        list.add(new MineFragment());
        viewPager.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager(),this,list));
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    public void initBottom(){
        mainBottomBeanList = new ArrayList<>();
        MainBottomBean home = new MainBottomBean("好课",R.mipmap.haoke_light,R.mipmap.haoke_dark);
        MainBottomBean listen = new MainBottomBean("上课",R.mipmap.class_light,R.mipmap.class_dark);
        MainBottomBean mine = new MainBottomBean("我的",R.mipmap.my_light,R.mipmap.my_dark);
        mainBottomBeanList.add(home);
        mainBottomBeanList.add(listen);
        mainBottomBeanList.add(mine);

    }
}
