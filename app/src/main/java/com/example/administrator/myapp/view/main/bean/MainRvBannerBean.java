package com.example.administrator.myapp.view.main.bean;

public class MainRvBannerBean {
    private int pic_url;
    private String title;

    public MainRvBannerBean(int pic_url, String title) {
        this.pic_url = pic_url;
        this.title = title;
    }

    public int getPic_url() {
        return pic_url;
    }

    public void setPic_url(int pic_url) {
        this.pic_url = pic_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
