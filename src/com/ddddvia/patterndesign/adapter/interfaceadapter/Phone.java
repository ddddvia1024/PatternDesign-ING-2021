package com.ddddvia.patterndesign.adapter.interfaceadapter;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Phone {
    /**
     * ��糡��
     * @param voltage ��ѹ
     */
    public void charging(Voltage5V voltage) {
        if (5 == voltage.output5V()) {
            System.out.println("��ʼ���");
        } else {
            System.out.println("�޷����");
        }
    }
}
