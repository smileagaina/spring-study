package com.shj.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成得到代理类
     * 代理类的classLoader
     * 被代理类的所有接口
     * this:当前的处理程序
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }



//    处理代理实例，并返回结果
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        // 动态代理的本质，就是使用反射实现
        Object result = method.invoke(rent,args);
        fare();
        return result;
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
