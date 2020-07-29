package com.pzx.decorator;

/**
 * 具体的装饰者类
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    /**
     * 返回被装饰对象的描述和自己本身的描述
     */
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    /**
     * 计算被装饰对象的价格加上自己本身的价格
     */
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
