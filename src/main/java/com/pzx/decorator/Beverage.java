package com.pzx.decorator;

/**
 * 组件抽象类，每个组件可以单独使用或者被装饰者包装起来使用
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
