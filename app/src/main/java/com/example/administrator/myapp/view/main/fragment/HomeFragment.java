package com.example.administrator.myapp.view.main.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.administrator.myapp.R;
import com.example.administrator.myapp.view.main.activity.MainActivity;
import com.example.administrator.myapp.view.main.adapter.HomeBottomAdapter;
import com.example.administrator.myapp.view.main.adapter.MainBottomAdapter;
import com.example.administrator.myapp.view.main.adapter.MainRvBannerAdapter;
import com.example.administrator.myapp.view.main.bean.MainBottomBean;
import com.example.administrator.myapp.view.main.bean.MainRvBannerBean;
import com.example.administrator.myapp.view.main.bean.MultiItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bingoogolapple.bgabanner.BGABanner;

public class HomeFragment extends Fragment {
    BGABanner bgaBanner;
    RecyclerView rv_home_banner;
    @BindView(R.id.rv_bottom_layout)
    RecyclerView rv_home;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        ButterKnife.bind(this,view);

        initLastView();
        initBanner();
        initRvBanner();
        return view;
    }



    public void initBanner(){
        bgaBanner.setAdapter(new BGABanner.Adapter() {
            @Override
            public void fillBannerItem(BGABanner banner, View itemView, @Nullable Object model, int position) {
                Glide.with(getActivity()).load(model).into((ImageView) itemView);
            }
        });
        bgaBanner.setData(Arrays.asList("http://seopic.699pic.com/photo/40005/7613.jpg_wh1200.jpg","http://seopic.699pic.com/photo/50045/5922.jpg_wh1200.jpg","http://seopic.699pic.com/photo/50086/2215.jpg_wh1200.jpg"),null);
    }

    private void initRvBanner() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_home_banner.setLayoutManager(linearLayoutManager);
        List<MainRvBannerBean> list = new ArrayList<>();
        MainRvBannerBean mainRvBannerBean = new MainRvBannerBean(R.mipmap.haoke_light,"开始");
        MainRvBannerBean mainRvBannerBean1 = new MainRvBannerBean(R.mipmap.haoke_dark,"结束");
        MainRvBannerBean mainRvBannerBean2 = new MainRvBannerBean(R.mipmap.class_light,"开始");
        MainRvBannerBean mainRvBannerBean3 = new MainRvBannerBean(R.mipmap.class_dark,"结束");
        MainRvBannerBean mainRvBannerBean4 = new MainRvBannerBean(R.mipmap.my_light,"开始");
        MainRvBannerBean mainRvBannerBean5 = new MainRvBannerBean(R.mipmap.my_dark,"结束");
        list.add(mainRvBannerBean);
        list.add(mainRvBannerBean1);
        list.add(mainRvBannerBean2);
        list.add(mainRvBannerBean3);
        list.add(mainRvBannerBean4);
        list.add(mainRvBannerBean5);
        list.add(mainRvBannerBean);
        list.add(mainRvBannerBean1);
        list.add(mainRvBannerBean2);
        list.add(mainRvBannerBean3);
        list.add(mainRvBannerBean4);
        list.add(mainRvBannerBean5);
        MainRvBannerAdapter mainRvBannerAdapter = new MainRvBannerAdapter(list);
        rv_home_banner.setAdapter(mainRvBannerAdapter);
    }

    public void initLastView(){
        List<MultiItem> list = new ArrayList<>();
        MultiItem multiItem0 = new MultiItem(1);
        MultiItem multiItem1 = new MultiItem(2);
        MultiItem multiItem2 = new MultiItem(3);
        list.add(multiItem0);
        list.add(multiItem1);
        list.add(multiItem2);
        HomeBottomAdapter mainBottomAdapter = new HomeBottomAdapter(list);
        rv_home.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_home.setAdapter(mainBottomAdapter);
        View home_head = LayoutInflater.from(getContext()).inflate(R.layout.layout_home_header,null);
        bgaBanner = home_head.findViewById(R.id.home_banner);
        rv_home_banner = home_head.findViewById(R.id.rv_home_banner);
        mainBottomAdapter.addHeaderView(home_head);
    }
}
