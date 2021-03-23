package com.ddddvia.patterndesign.factory.simplefactory.pizzastore.order;

import com.ddddvia.patterndesign.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        String orderType = "";
        do {
            orderType = getOrderType();
            pizza = simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.setName(orderType);
                //输出Pizza的制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("订购成功");
                System.out.println("==========================");
            } else {
                System.out.println("订购失败");
                System.out.println("==========================");
            }
        } while (true);
    }


    //    // 构造器
//    public OrderPizza() {
//        //订购的pizza
//        Pizza pizza = null;
//        do {
//            //订购的pizza类型
//            String orderType;
//            orderType = getOrderType();
////            if (orderType.equals("greek")) {
////                pizza = new GreekPizza();
////            } else if (orderType.equals("cheese")) {
////                pizza = new CheesePizza();
////            } else {
////                break;
////            }
//            pizza.setName(orderType);
//            //输出Pi   zza的制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    public OrderPizza() {
        do {
            setSimpleFactory(new SimpleFactory());
            //输出Pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    /**
     * 设置订购类型
     */
    private String getOrderType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入Pizza的类型");
            String str = strIn.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
