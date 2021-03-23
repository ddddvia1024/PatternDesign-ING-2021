package com.ddddvia.patterndesign.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public abstract class Pizza {
    protected String name;

    //����������ԭ���ϲ�һ���������˳��󷽷�
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "��ʼ����");
    }

    public void cut() {
        System.out.println(name + "�и�");
    }

    public void box() {
        System.out.println(name + "���");
    }

    public void setName(String name) {
        this.name = name;
    }
}
