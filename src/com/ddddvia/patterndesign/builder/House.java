package com.ddddvia.patterndesign.builder;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class House {
    private  String high;
    private String weight;

    public String getHigh() {
        return high;
    }

    public String getWeight() {
        return weight;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "House{" +
                "high='" + high + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

}
