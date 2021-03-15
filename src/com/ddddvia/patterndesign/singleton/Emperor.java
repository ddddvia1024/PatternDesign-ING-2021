package com.ddddvia.patterndesign.singleton;

/**
 * 皇帝类
 *
 * @Author: hedwf
 * @Date: 2021.1.19
 * @Version: 1.0
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor() {

    }

    public static Emperor getInstance() {
        return emperor;
    }

    /**
     * 静态方法say,尽量是static
     */
    public static void say() {
        System.out.println("Singleton Pattern");
        System.out.println("我是皇帝哈哈哈");
    }
}
