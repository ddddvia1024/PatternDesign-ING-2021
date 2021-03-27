package com.ddddvia.patterndesign.prototype.deepclone;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 1, "white");
        DeepProtoType deepProtoType = new DeepProtoType("Jack", "2", sheep);
        DeepProtoType deepProtoType1 = deepProtoType.deepClone();
        System.out.println(deepProtoType.toString() + " deepProtoType.hashcode: " + deepProtoType.hashCode() + " sheep.hashcode: " + deepProtoType.getSheep().hashCode());
        System.out.println(deepProtoType1.toString() + " deepProtoType1.hashcode: " + deepProtoType1.hashCode() + " sheep1.hashcode: " + deepProtoType1.getSheep().hashCode());
    }
}
