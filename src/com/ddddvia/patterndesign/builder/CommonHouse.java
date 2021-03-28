package com.ddddvia.patterndesign.builder;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("ƽ���ػ�");
    }

    @Override
    public void buildWalls() {
        System.out.println("ƽ����ǽ");
    }

    @Override
    public void roofed() {
        System.out.println("ƽ���ⶥ");
    }
}
