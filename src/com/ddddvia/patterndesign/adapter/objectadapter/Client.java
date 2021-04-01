package com.ddddvia.patterndesign.adapter.objectadapter;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Phone phone =new Phone();
        //将适配器与手机直接关联
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
