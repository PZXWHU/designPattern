package com.pzx.factory.factoryMethod;


import com.pzx.factory.pizza.Pizza;

/**
 * 创建者类
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 工厂方法，将创建对象的任务交给子类去实现
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);


}
