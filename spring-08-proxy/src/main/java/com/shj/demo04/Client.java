package com.shj.demo04;

import com.shj.demo02.UserService;
import com.shj.demo02.UserServiceImpl;

// 客户端
public class Client {
    public static void main(String[] args) {
        // 真实角色,server
        UserServiceImpl userService = new UserServiceImpl();

        // 代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 把真实角色代理
        pih.setTarget(userService);//设置代理对象
        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.update();


    }
}
