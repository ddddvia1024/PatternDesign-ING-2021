package com.ddddvia.patterndesign.adapter.objectadapter;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class VoltageAdapter implements Voltage5V {

     private Voltage220V voltage220V ;

    /**
     * ���������������뱻�����ߵĹ�����ϵ
     * @return
     */
    @Override
    public int output5V() {
        int voltage =  voltage220V.output();

        if (voltage==220){
            return voltage/44;
        }else {
            return voltage;
        }
    }

    public VoltageAdapter (Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

}
