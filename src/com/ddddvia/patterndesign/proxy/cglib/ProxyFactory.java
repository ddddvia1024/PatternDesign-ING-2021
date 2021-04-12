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
     * ������������һ�����������
     *
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }


    /**
     * ����һ�����������target����Ĵ������
     *
     * @return
     */
    public Object getProxyInstance() {
        //����һ��������
        Enhancer enhancer = new Enhancer();
        //���ø���
        enhancer.setSuperclass(target.getClass());
        //���ûص�����
        enhancer.setCallback(this);
        //����������󣬼��������
        return enhancer.create();
    }

    /**
     * ��дintercept�������ص���Ŀ�����ķ���
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
        System.out.println("Cglib����ʼ������");
        Object returnObj = method.invoke(target, objects);
        System.out.println("Cglib�����ύ������");
        return returnObj;
    }
}
