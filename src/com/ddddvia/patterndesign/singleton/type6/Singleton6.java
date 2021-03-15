package com.ddddvia.patterndesign.singleton.type6;

/**
 * @Author: hedwf
 * @Date: 2021.3.15
 * @Version: 1.0
 */
public class Singleton6 {
    public static void main(String[] args) {
        // 测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("type6:静态内部类");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}


class Singleton{
    private Singleton(){

    }
    //静态内部类中添加一个静态属性
    private static class SingletonInstance{
        private  static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回
    public  static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
