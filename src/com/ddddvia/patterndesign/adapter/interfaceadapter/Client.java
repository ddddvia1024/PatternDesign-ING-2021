package com.ddddvia.patterndesign.adapter.interfaceadapter;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Phone phone =new Phone();
        //�����������ֻ�ֱ�ӹ���
        phone.charging(new VoltageAdapterSon(new Voltage220V()));
    }
}
