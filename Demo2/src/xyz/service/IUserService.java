package xyz.service;

import xyz.entity.User;

public interface IUserService {
    void addUser(User user);

    int updateUser(User user);
    void deleteUserById(int id);

}
