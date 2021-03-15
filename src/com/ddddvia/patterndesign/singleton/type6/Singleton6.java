package com.ddddvia.patterndesign.singleton.type6;

/**
 * @Author: hedwf
 * @Date: 2021.3.15
 * @Version: 1.0
 */
public class Singleton6 {
    public static void main(String[] args) {
        // ����
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("type6:��̬�ڲ���");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}


class Singleton{
    private Singleton(){

    }
    //��̬�ڲ��������һ����̬����
    private static class SingletonInstance{
        private  static final Singleton INSTANCE = new Singleton();
    }

    //�ṩһ����̬�Ĺ��з�����ֱ�ӷ���
    public  static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
