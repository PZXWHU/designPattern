package com.pzx.decorator;

/**
 * 装饰者抽象类，必须继承自Beverage，从而可以代替Beverage
 * 装饰者类内部都会有一个被装饰对象的引用
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    //需要具体的装饰者重新实现该方法
    public abstract String getDescription();
}
