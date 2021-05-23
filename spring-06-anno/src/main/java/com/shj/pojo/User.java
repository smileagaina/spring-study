package com.shj.pojo;

import com.shj.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    public String name;

    @Value("hello2")
    public void setName(String name) { this.name = name; }



}
