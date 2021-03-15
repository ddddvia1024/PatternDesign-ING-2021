package com.ddddvia.patterndesign.singleton;

/**
 * 线程安全的单例模式，需要加一个synchronized变成线程安全的
 *
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Singleton2 {
    private static Singleton2 singleton = null;

    // 构造方法私有，防止在其他地方调用构造函数生成对象
    private Singleton2() {
    }

    // public方法，保持Single只有一个实例
    public static synchronized Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
