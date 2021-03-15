package com.ddddvia.patterndesign.singleton.type5;

/**
 * @Author: hedwf
 * @Date: 2021.3.15
 * @Version: 1.0
 */
public class Singleton5 {
    public static void main(String[] args) {
        // ����
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("type5:˫�ؼ��");
        System.out.println("singleton == singleton1: " + (singleton == singleton1));
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}


class Singleton{
    //volatile �����������������synchronized,�б仯���������µ��ڴ���ﵽͬ����Ч��
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
