package com.ddddvia.patterndesign.prototype;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom",3,"white");
        Sheep sheep1 = (Sheep)sheep.clone();
        System.out.println(sheep.toString()+" hashcode: "+sheep.hashCode());
        System.out.println(sheep.toString()+" hashcode: "+sheep1.hashCode());
    }
}
