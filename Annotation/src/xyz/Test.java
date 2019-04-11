package xyz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.dao.UserDaoImpl;
import xyz.entity.User;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao = (UserDaoImpl) context.getBean("studentDao");
        userDao.addUser(new User());
    }
}
