package com.shj.demo01;

/**
 * 代理人
 */
public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    // 看房
    public void seeHouse() {
        System.out.println("看房");
    }

    // 收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    // 签合同
    public void hetong() {
        System.out.println("签合同");
    }
}
