package com.ddddvia.patterndesign.proxy.dynamic;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {


    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        System.out.println("proxy = " + proxyInstance.toString());
//        System.out.println("proxy.class = " + proxyInstance.getClass());

        proxyInstance.teach();


    }

}
