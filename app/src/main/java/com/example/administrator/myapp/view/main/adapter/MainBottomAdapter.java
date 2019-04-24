package com.example.administrator.myapp.view.main.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.myapp.R;
import com.example.administrator.myapp.view.main.bean.MainBottomBean;

import java.util.List;

public class MainBottomAdapter extends BaseQuickAdapter<MainBottomBean,BaseViewHolder> {
    public MainBottomAdapter(@Nullable List<MainBottomBean> data) {
        super(R.layout.item_layout_bottom,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainBottomBean item) {
        if (item.isSelect()){
            Glide.with(mContext).load(item.getSelect_url()).into((ImageView) helper.getView(R.id.iv_bottom_pic));
        }else{
            Glide.with(mContext).load(item.getUnselect_url()).into((ImageView) helper.getView(R.id.iv_bottom_pic));
        }
        helper.setText(R.id.tv_bootom_title,item.getTitle());
    }
}
