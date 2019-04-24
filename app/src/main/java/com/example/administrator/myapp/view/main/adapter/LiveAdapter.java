package com.example.administrator.myapp.view.main.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.myapp.R;
import com.example.administrator.myapp.view.main.bean.LiveBean;

import java.util.List;

public class LiveAdapter extends BaseQuickAdapter<LiveBean,BaseViewHolder> {
    public LiveAdapter(@Nullable List<LiveBean> data) {
        super(R.layout.item_live_layout,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, LiveBean item) {
                helper.setText(R.id.tv_live_status,item.getLive_status());
                if (item.isLive_isHidden()){
                    helper.setGone(R.id.iv_live,false);
                }else{
                    helper.setGone(R.id.iv_live,true);
                }
                helper.setText(R.id.tv_live_time,item.getLive_time());
                helper.setText(R.id.tv_live_num,item.getLive_num());
                helper.setText(R.id.tv_class_name,item.getLive_name());
                Glide.with(mContext).load(R.mipmap.touxiang).apply(RequestOptions.bitmapTransform(new CircleCrop())).into((ImageView) helper.getView(R.id.iv_class_pic));
                helper.setText(R.id.tv_class_author,item.getLive_author() + " | " + item.getLive_type());
                if (item.getLive_status().equals("直播中")){
                    helper.setText(R.id.tv_class_in,"立即进入");
                    helper.setBackgroundRes(R.id.tv_class_in,R.mipmap.lijijinru);
                }else if (item.getLive_status().equals("直播预告")){
                    helper.setText(R.id.tv_class_in,"开启提醒");
                    helper.setBackgroundRes(R.id.tv_class_in,R.mipmap.lijijinru);
                }else{
                    helper.setText(R.id.tv_class_in,"查看回放");
                    helper.setBackgroundRes(R.id.tv_class_in,R.mipmap.chakanhuifang);
                }
    }
}
