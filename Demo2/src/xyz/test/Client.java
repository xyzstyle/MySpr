package xyz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.entity.User;
import xyz.service.IUserService;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        //userService.addUser(new User());
        //userService.deleteUserById(11);
        userService.updateUser(new User());
    }
}
