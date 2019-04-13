package xyz.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.dao.IUserDao;

import xyz.entity.User;
import xyz.service.IUserService;

public class UserServiceImpl implements IUserService {


    //IUserDao userDao=new UserDaoImpl();
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void addUser(User user) {
        //userDao=null;
        userDao.addUser(user);
    }

    @Override
    public void deleteUserById(int id) {
        System.out.println("delete User");
    }
}
