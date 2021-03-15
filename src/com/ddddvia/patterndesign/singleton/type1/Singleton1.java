package com.ddddvia.patterndesign.singleton.type1;

/**
 * @Author: hedwf
 * @Date: 2021.3.11
 * @Version: 1.0
 */
public class Singleton1 {
    public static void main(String[] args) {
        // 测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("type1");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());

    }
}

class Singleton {
    //静态变量，内部创建对象实例
    private final static Singleton singleton = new Singleton();

    //构造器私有化，防止外部实例
    private Singleton() {

    }

    //提供公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return singleton;
    }
}