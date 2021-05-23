package com.shj.demo04;

import com.shj.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//JDK动态代理（默认）实现的是InvocationHandler， //Cglib动态代理，实现MethodInterceptor接口
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 生成得到代理类
     * 代理类的classLoader
     * 被代理类的所有接口
     * this:当前的处理程序
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    /**
     * 代理处理程序。
     * 当在代理实例上调用方法（比如proxy代理的userService的updata,select,delete等）时候，方法调用将被编码并分派到其调用处理程序的invoke()方法
     * 处理代理实例，并返回结果
     */
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质，就是使用反射实现.invoke反射 调用target的一些方法
       log(method.getName());//反射是万能的
        Object result = method.invoke(target,args);
        return result;
    }

    public void log(String msg) {
        System.out.println("执行了 " + msg + " 方法");
    }

}
