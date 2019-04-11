package xyz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionAssignment collection = (CollectionAssignment) context.getBean("collection");
        System.out.println(collection);
    }

}
