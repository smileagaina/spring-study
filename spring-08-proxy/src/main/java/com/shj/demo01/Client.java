package com.shj.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //中介人帮房东租房子。代理角色一般会有一些附属操作，不然代理角色没有意义
        Proxy proxy = new Proxy(host);

        // 你直接找中介就好了。
        proxy.rent();
    }
}
