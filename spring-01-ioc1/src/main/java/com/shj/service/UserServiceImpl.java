package com.shj.service;

import com.shj.dao.UserDao;
import com.shj.dao.UserDaoImpl;
import com.shj.dao.UserMysqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userdao) {
        this.userDao = userdao;
    }

    public void getUser() {
        this.userDao.getUser();
    }

}
