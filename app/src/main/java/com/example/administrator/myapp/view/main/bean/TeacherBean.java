package com.example.administrator.myapp.view.main.bean;

public class TeacherBean {
    private String type;
    private String name;
    private String introduce;

    public TeacherBean(String type, String name, String introduce) {
        this.type = type;
        this.name = name;
        this.introduce = introduce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}

