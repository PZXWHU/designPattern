package com.pzx.factory.simpleFactory;

import com.pzx.factory.pizza.*;

/**
 * 简单工厂:其实不是一种设计模式，而是一种编程习惯
 */
public class SimplePizzaFactory {

    /**
     * 静态工厂：将创建方法申明为静态方法，但是这样就不能通过继承来改变创建方法的行为。
     * @param type
     * @return
     */
    public static Pizza createPizza(String type){
        Pizza pizza = null;

        switch (type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VegglePizza();
                break;
            default:

        }
        return pizza;
    }

}
