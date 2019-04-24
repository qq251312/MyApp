package com.example.administrator.myapp.view.main.bean;

public class RecommendBean {
    private String class_name;
    private String class_author;
    private String class_type;
    private String class_num;
    private String class_before_price;
    private String class_now_price;

    public RecommendBean(String class_name, String class_author, String class_type, String class_num, String class_before_price, String class_now_price) {
        this.class_name = class_name;
        this.class_author = class_author;
        this.class_type = class_type;
        this.class_num = class_num;
        this.class_before_price = class_before_price;
        this.class_now_price = class_now_price;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getClass_author() {
        return class_author;
    }

    public void setClass_author(String class_author) {
        this.class_author = class_author;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }

    public String getClass_num() {
        return class_num;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public String getClass_before_price() {
        return class_before_price;
    }

    public void setClass_before_price(String class_before_price) {
        this.class_before_price = class_before_price;
    }

    public String getClass_now_price() {
        return class_now_price;
    }

    public void setClass_now_price(String class_now_price) {
        this.class_now_price = class_now_price;
    }
}
