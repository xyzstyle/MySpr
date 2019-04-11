package xyz.dao.impl;

import xyz.dao.IUserDao;
import xyz.entity.User;

public class UserDaoImpl implements IUserDao{
    @Override
    public void addUser(User user) {
        System.out.println("Add User");
    }
}
