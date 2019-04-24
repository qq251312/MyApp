package com.example.administrator.myapp.view.main.adapter;

import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.myapp.R;
import com.example.administrator.myapp.view.main.bean.RecommendBean;

import java.util.List;

public class RecommendAdapter extends BaseQuickAdapter<RecommendBean,BaseViewHolder> {
    public RecommendAdapter(@Nullable List<RecommendBean> data) {
        super(R.layout.item_recommend_layout,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, RecommendBean item) {
        helper.setText(R.id.tv_class_name,item.getClass_name());
        helper.setText(R.id.tv_class_author,item.getClass_author() + " | " + item.getClass_type());
        TextView textView = (TextView)helper.getView(R.id.tv_class_before_price);
        textView.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        helper.setText(R.id.tv_class_before_price,item.getClass_before_price());
        helper.setText(R.id.tv_class_now_price,item.getClass_now_price());
        helper.setText(R.id.tv_class_num,item.getClass_num());
    }
}
