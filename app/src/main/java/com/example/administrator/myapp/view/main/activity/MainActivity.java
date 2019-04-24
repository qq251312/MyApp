package com.example.administrator.myapp.view.main.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.administrator.myapp.R;
import com.example.administrator.myapp.base.BaseActivity;
import com.example.administrator.myapp.view.listen.fragment.ListenFragment;
import com.example.administrator.myapp.view.main.adapter.MainBottomAdapter;
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
    @BindView(R.id.rv_bottom)
    RecyclerView rv_bottom;
    private int lastPosition;
    MainBottomAdapter mainBottomAdapter;
    @Override
    protected void initView() {
        initFragment();

        initBottom();

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    public void initBottom(){
        mainBottomBeanList = new ArrayList<>();
        MainBottomBean home = new MainBottomBean("好课",R.mipmap.haoke_light,R.mipmap.haoke_dark);
        home.setSelect(true);
        MainBottomBean listen = new MainBottomBean("上课",R.mipmap.class_light,R.mipmap.class_dark);
        listen.setSelect(false);
        MainBottomBean mine = new MainBottomBean("我的",R.mipmap.my_light,R.mipmap.my_dark);
        mine.setSelect(false);
        mainBottomBeanList.add(home);
        mainBottomBeanList.add(listen);
        mainBottomBeanList.add(mine);
        mainBottomAdapter = new MainBottomAdapter(mainBottomBeanList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,mainBottomBeanList.size());
        rv_bottom.setLayoutManager(gridLayoutManager);
        rv_bottom.setAdapter(mainBottomAdapter);
        mainBottomAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                mainBottomBeanList.get(position).setSelect(true);
                mainBottomAdapter.notifyItemChanged(position);
                mainBottomBeanList.get(lastPosition).setSelect(false);
                mainBottomAdapter.notifyItemChanged(lastPosition);
                if (lastPosition != position){
                        viewPager.setCurrentItem(position);
                    }
                    lastPosition = position;
            }
        });
    }

    public void initFragment(){
        list = new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new ListenFragment());
        list.add(new MineFragment());
        viewPager.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager(),this,list));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                mainBottomBeanList.get(i).setSelect(true);
                mainBottomAdapter.notifyItemChanged(i);
                mainBottomBeanList.get(lastPosition).setSelect(false);
                mainBottomAdapter.notifyItemChanged(lastPosition);
                lastPosition = i;
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
}
