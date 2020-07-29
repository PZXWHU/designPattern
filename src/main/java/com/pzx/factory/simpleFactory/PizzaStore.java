package com.pzx.factory.simpleFactory;

import com.pzx.factory.pizza.Pizza;
import com.pzx.factory.simpleFactory.SimplePizzaFactory;

public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}

