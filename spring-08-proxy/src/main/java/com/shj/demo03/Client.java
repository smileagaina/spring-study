package com.shj.demo03;

import com.shj.demo01.Proxy;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 代理角色：现在没有
        // 调用程序处理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);


        Rent proxy = (Rent) pih.getProxy();//这个proxy就是动态生成的
        proxy.rent();
    }
}
