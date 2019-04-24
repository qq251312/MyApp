package com.example.administrator.myapp.view.main.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class MultiItem implements MultiItemEntity {
    public static final int one = 1;
    public static final int two = 2;
    public static final int three = 3;
    public static final int four = 4;
    private int type;

    public MultiItem(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int getItemType() {
        return type;
    }
}
