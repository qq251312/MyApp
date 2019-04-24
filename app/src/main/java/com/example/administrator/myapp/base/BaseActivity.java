package com.example.administrator.myapp.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.example.administrator.myapp.R;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    protected View mContentView;
    protected FrameLayout mContentFrame;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.layout_root);
        mContentView = LayoutInflater.from(this).inflate(getLayoutId(),null);
        mContentFrame = findViewById(R.id.root_frame);
        mContentFrame.addView(mContentView);
        ButterKnife.bind(this);
        initView();
    }

    protected abstract void initView();



    /**
     * 返回界面布局文件
     * @return 界面布局ID
     */
    protected abstract @LayoutRes
    int getLayoutId();
}
