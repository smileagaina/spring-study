package com.shj.pojo;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT无参数构造");
    }

    public UserT(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name " + name);
    }
}
