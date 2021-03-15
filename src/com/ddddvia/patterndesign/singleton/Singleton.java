package com.ddddvia.patterndesign.singleton;

/**
 * ����ģʽͨ�ô���
 * @Author: hedwf
 * @Date: 2020.1.22
 * @Version: 1.0
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    /**
     * ���Ʋ����������
     */
    private Singleton(){
    }

    /**
     * ͨ���÷�����ȡʵ������
     * @return
     */
    public static Singleton getSingleton() {
        return singleton;
    }

    /**
     * ��������������������static
     */
    public static void dosomething(){

    }
}
