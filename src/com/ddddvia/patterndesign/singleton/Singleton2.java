package com.ddddvia.patterndesign.singleton;

/**
 * �̰߳�ȫ�ĵ���ģʽ����Ҫ��һ��synchronized����̰߳�ȫ��
 *
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Singleton2 {
    private static Singleton2 singleton = null;

    // ���췽��˽�У���ֹ�������ط����ù��캯�����ɶ���
    private Singleton2() {
    }

    // public����������Singleֻ��һ��ʵ��
    public static synchronized Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
