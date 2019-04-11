package xyz.dao;

import org.springframework.stereotype.Component;
import xyz.entity.User;

@Component("studentDao")
public class UserDaoImpl {
    public void addUser(User user) {
        System.out.println("Add User");
    }
}
