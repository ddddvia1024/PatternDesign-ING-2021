package com.ddddvia.patterndesign.adapter.interfaceadapter;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Phone {
    /**
     * 充电场景
     * @param voltage 电压
     */
    public void charging(Voltage5V voltage) {
        if (5 == voltage.output5V()) {
            System.out.println("开始充电");
        } else {
            System.out.println("无法充电");
        }
    }
}
