package com.shj.demo02;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userServiceimpl;

    public void setUserServiceimpl(UserServiceImpl userService) {
        this.userServiceimpl = userService;
    }

    public void add() {
        log("add");
        userServiceimpl.add();
    }

    public void delete() {
        log("delete");
        userServiceimpl.delete();
    }

    public void update() {
        log("update");
        userServiceimpl.update();
    }

    public void select() {
        log("select");
        userServiceimpl.select();
    }


    public void log(String msg) {
        System.out.println("使用了 " + msg + " 方法");
    }
}
