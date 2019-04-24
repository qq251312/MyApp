package com.example.administrator.myapp.view.main.bean;

public class LiveBean {
    private String live_status;
    private boolean live_isHidden;
    private String live_time;
    private String live_num;
    private String live_name;
    private int live_pic;
    private String live_author;
    private String live_type;

    public LiveBean(String live_status, boolean live_isHidden,String live_time, String live_num, String live_name, int live_pic, String live_author, String live_type) {
        this.live_status = live_status;
        this.live_isHidden = live_isHidden;
        this.live_time = live_time;
        this.live_num = live_num;
        this.live_name = live_name;
        this.live_pic = live_pic;
        this.live_author = live_author;
        this.live_type = live_type;
    }

    public String getLive_status() {
        return live_status;
    }

    public void setLive_status(String live_status) {
        this.live_status = live_status;
    }

    public boolean isLive_isHidden() {
        return live_isHidden;
    }

    public void setLive_isHidden(boolean live_isHidden) {
        this.live_isHidden = live_isHidden;
    }

    public String getLive_time() {
        return live_time;
    }

    public void setLive_time(String live_time) {
        this.live_time = live_time;
    }

    public String getLive_num() {
        return live_num;
    }

    public void setLive_num(String live_num) {
        this.live_num = live_num;
    }

    public String getLive_name() {
        return live_name;
    }

    public void setLive_name(String live_name) {
        this.live_name = live_name;
    }

    public int getLive_pic() {
        return live_pic;
    }

    public void setLive_pic(int live_pic) {
        this.live_pic = live_pic;
    }

    public String getLive_author() {
        return live_author;
    }

    public void setLive_author(String live_author) {
        this.live_author = live_author;
    }

    public String getLive_type() {
        return live_type;
    }

    public void setLive_type(String live_type) {
        this.live_type = live_type;
    }
}
