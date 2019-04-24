package com.example.administrator.myapp.view.main.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.administrator.myapp.R;
import com.example.administrator.myapp.view.main.bean.TeacherBean;

import java.util.List;

public class TeacherAdapter extends BaseQuickAdapter<TeacherBean,BaseViewHolder> {
    public TeacherAdapter(@Nullable List<TeacherBean> data) {
        super(R.layout.item_teacher_layout,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TeacherBean item) {
        helper.setText(R.id.tv_teacher_introduce,item.getIntroduce());
        helper.setText(R.id.tv_teacher_name,item.getName());
        helper.setText(R.id.tv_teacher_type,item.getType());
    }
}
