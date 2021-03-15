package com.ddddvia.patterndesign.singleton;

/**
 * 单例模式通用代码
 * @Author: hedwf
 * @Date: 2020.1.22
 * @Version: 1.0
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    /**
     * 限制产生多个对象
     */
    private Singleton(){
    }

    /**
     * 通过该方法获取实例对象
     * @return
     */
    public static Singleton getSingleton() {
        return singleton;
    }

    /**
     * 类中其他方法，尽量是static
     */
    public static void dosomething(){

    }
}
