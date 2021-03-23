package com.ddddvia.patterndesign.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public abstract class Pizza {
    protected String name;

    //各个披萨的原材料不一样，做成了抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "开始烘培");
    }

    public void cut() {
        System.out.println(name + "切割");
    }

    public void box() {
        System.out.println(name + "打包");
    }

    public void setName(String name) {
        this.name = name;
    }
}
