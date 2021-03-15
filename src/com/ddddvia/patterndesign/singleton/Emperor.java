package com.ddddvia.patterndesign.singleton;

/**
 * �ʵ���
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
     * ��̬����say,������static
     */
    public static void say() {
        System.out.println("Singleton Pattern");
        System.out.println("���ǻʵ۹�����");
    }
}
