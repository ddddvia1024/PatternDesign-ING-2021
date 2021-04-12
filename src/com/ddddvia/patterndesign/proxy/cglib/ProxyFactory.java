package com.ddddvia.patterndesign.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class ProxyFactory implements MethodInterceptor {
    Object target;

    /**
     * 构造器，传入一个被代理对象
     *
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }


    /**
     * 返回一个代理对象，是target对象的代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept方法，回调用目标对象的方法
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理开始～～～");
        Object returnObj = method.invoke(target, objects);
        System.out.println("Cglib代理提交～～～");
        return returnObj;
    }
}
