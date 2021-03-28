package com.ddddvia.patterndesign.builder;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("平房地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("平房砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("平房封顶");
    }
}
