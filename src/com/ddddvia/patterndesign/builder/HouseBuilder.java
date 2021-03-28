package com.ddddvia.patterndesign.builder;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public abstract class HouseBuilder {
    House house = new House();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    public House build(){
        return house;
    }
}
