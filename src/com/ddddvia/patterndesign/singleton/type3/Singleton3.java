package com.ddddvia.patterndesign.singleton.type3;

/**
 * @Author: hedwf
 * @Date: 2021.3.15
 * @Version: 1.0
 */
public class Singleton3 {
    public static void main(String[] args) {
// 测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("type3: 懒汉式（线程不安全）");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}


class Singleton{
    private   static Singleton instance;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }
}
