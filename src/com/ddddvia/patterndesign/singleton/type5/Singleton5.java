package com.ddddvia.patterndesign.singleton.type5;

/**
 * @Author: hedwf
 * @Date: 2021.3.15
 * @Version: 1.0
 */
public class Singleton5 {
    public static void main(String[] args) {
        // 测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("type5:双重检查");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}


class Singleton{
    //volatile 共享变量，轻量级的synchronized,有变化会立即更新到内存里，达到同步的效果
    private static volatile Singleton instance;
    private Singleton(){

    }

    public  static  Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
