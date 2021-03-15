package com.ddddvia.patterndesign.singleton;

/**
 * @Author: hedwf
 * @Date: 2020.1.19
 * @Version: 1.0
 */
public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();

            Emperor emperor1 = Emperor.getInstance();

            //����ͬһʵ������
            System.out.println(emperor);
            System.out.println(emperor1);
        }
    }
}

