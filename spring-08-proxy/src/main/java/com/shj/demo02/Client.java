package com.shj.demo02;

public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserServiceimpl(userService);

        proxy.delete();
    }
}
