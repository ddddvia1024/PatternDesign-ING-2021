package com.ddddvia.patterndesign.singleton.type1;

/**
 * @Author: hedwf
 * @Date: 2021.3.11
 * @Version: 1.0
 */
public class Singleton1 {
    public static void main(String[] args) {
        // ����
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("type1");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());

    }
}

class Singleton {
    //��̬�������ڲ���������ʵ��
    private final static Singleton singleton = new Singleton();

    //������˽�л�����ֹ�ⲿʵ��
    private Singleton() {

    }

    //�ṩ���еľ�̬����������ʵ������
    public static Singleton getInstance() {
        return singleton;
    }
}