package xyz.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After Advice");
        System.out.println("target:"+target);
        System.out.println("Method Name;" + method.getName());
        System.out.println("Method args number:"+args.length);
        System.out.println("Method return value:"+returnValue);
        System.out.println("End of After Advice");
    }
}
