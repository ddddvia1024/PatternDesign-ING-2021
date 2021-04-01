package com.ddddvia.patterndesign.adapter.interfaceadapter;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public abstract class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter (Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    /**
     * ���������������뱻�����ߵĹ�����ϵ
     * @return
     */
    @Override
    public int output5V() {
        int voltage = voltage220V.output();

        if (voltage==220){
            return voltage/44;
        }else {
            return voltage;
        }
    }

}
