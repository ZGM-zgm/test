package com.gm.dao.impl;

import com.gm.dao.UserDao;

public class User implements UserDao {
    @Override
    public void show() {
        System.out.println("hello，world");
    }
}
