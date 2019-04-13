package xyz.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogRound implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        //方法体1，前置内容
        System.out.println("前置内容1");
        Object result=null;
        try {
            System.out.println("前置内容2");
            //前置内容
            result=invocation.proceed();//控制着目标方法是否执行，如果有此行代码，则会执行addStudent，否则不执行
            //result就是目标方法addStudent方法的返回值

            //后置通知
            System.out.println("后置内容1");
            System.out.println("target:"+invocation.getThis());
            System.out.println("Method Name;" + invocation.getMethod().getName());
            System.out.println("Method args number:"+invocation.getArguments().length);
            System.out.println("Method return value:"+result);
            System.out.println("后置内容1结束");
        } catch (Exception e) {
            //方法体，异常通知
            System.out.println("异常内容1");
        }

        return result;
    }
}
