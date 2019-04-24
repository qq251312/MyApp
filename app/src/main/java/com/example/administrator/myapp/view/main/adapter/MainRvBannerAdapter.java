package com.example.administrator.myapp.view.main.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.myapp.R;
import com.example.administrator.myapp.view.main.bean.MainRvBannerBean;

import java.util.List;

public class MainRvBannerAdapter extends BaseQuickAdapter<MainRvBannerBean,BaseViewHolder> {
    public MainRvBannerAdapter(@Nullable List<MainRvBannerBean> data) {
        super(R.layout.item_layout_banner,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainRvBannerBean item) {
        helper.setText(R.id.tv_banner_title,item.getTitle());
        Glide.with(mContext).load(item.getPic_url()).into((ImageView) helper.getView(R.id.iv_banner_pic));
    }
}
