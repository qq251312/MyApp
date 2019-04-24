package com.example.administrator.myapp.view.main.bean;

public class MainBottomBean  {
    private String title;
    private boolean select;
    private int select_url;
    private int unselect_url;

    public MainBottomBean(String title, int select_url, int unselect_url) {
        this.title = title;
        this.select_url = select_url;
        this.unselect_url = unselect_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public int getSelect_url() {
        return select_url;
    }

    public void setSelect_url(int select_url) {
        this.select_url = select_url;
    }

    public int getUnselect_url() {
        return unselect_url;
    }

    public void setUnselect_url(int unselect_url) {
        this.unselect_url = unselect_url;
    }
}
