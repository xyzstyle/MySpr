package xyz.aop1;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * Created by xyz in MySpr on 2019/4/13 .
 */
@Component("logAnnotation")
@Aspect
public class LogAspectAnnotation {

    //前置通知
    @Before("execution(public int xyz.service.impl.UserServiceImpl.updateUser(xyz.entity.User))")//定义属性，切点
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("My Before Advice of Annotation");
        System.out.println("Target Object:"+joinPoint.getTarget());
        System.out.println("Method:" + joinPoint.getSignature().getName());
        System.out.println("Method argument:" + Arrays.toString(joinPoint.getArgs()));

    }

    //后置通知
    @AfterReturning(pointcut = "execution(public int xyz.service.impl.UserServiceImpl.updateUser(xyz.entity.User))",returning="returningValue")
    public void myAfter(JoinPoint joinPoint,Object returningValue) {
        System.out.println("My After Advice of Annotation");
        System.out.println("jp:"+Arrays.toString(joinPoint.getArgs()));
        System.out.println("Return value:"+returningValue);
    }

    //环绕通知
    @Around("execution(public int xyz.service.impl.UserServiceImpl.updateUser(xyz.entity.User))")
    public void MyARound() {

    }



    //异常通知
    @AfterThrowing("execution(public int xyz.service.impl.UserServiceImpl.updateUser(xyz.entity.User))")
    public void MyException() {
        System.out.println("异常通知xyz");
    }

    //最终通知
}
