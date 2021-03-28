package com.ddddvia.patterndesign.builder;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class LoftHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("复式地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("复式砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("复式封顶");
    }
}
