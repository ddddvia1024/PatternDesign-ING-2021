package com.ddddvia.patterndesign.builder;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class LoftHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("��ʽ�ػ�");
    }

    @Override
    public void buildWalls() {
        System.out.println("��ʽ��ǽ");
    }

    @Override
    public void roofed() {
        System.out.println("��ʽ�ⶥ");
    }
}
