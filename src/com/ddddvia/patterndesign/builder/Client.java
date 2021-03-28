package com.ddddvia.patterndesign.builder;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
         House house =  houseDirector.constructHouse();
    }
}
