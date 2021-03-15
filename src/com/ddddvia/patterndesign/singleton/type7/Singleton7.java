package com.ddddvia.patterndesign.singleton.type7;

/**
 * @Author: hedwf
 * @Date: 2021.3.15
 * @Version: 1.0
 */
public class Singleton7 {
    public static void main(String[] args) {
        // ≤‚ ‘
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
        System.out.println("type7:√∂æŸ");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}

enum Singleton{
    INSTANCE;
}

