package com.ddddvia.patterndesign.singleton.type2;

/**
 * @Author: hedwf
 * @Date: 2021.2.11
 * @Version: 1.0
 */
public class Singleton2 {
    public static void main(String[] args) {
        // ≤‚ ‘
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("type2");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());

    }
}

class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
