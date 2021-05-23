package com.shj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//这里这个注解的意思就是，说明这个类被Spring接管了，注册到了Spring IOC 容器中。
public class User {

    private String name;

    public String getName() {
        return name;
    }


    @Value("测试")
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
