package com.ddddvia.patterndesign.adapter.classadapter;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    /**
     * 适配器，适配者与被适配者的关联关系
     * @return
     */
    @Override
    public int output5V() {
        int voltage = output();

        if (voltage==220){
            return voltage/44;
        }else {
            return voltage;
        }
    }

}
