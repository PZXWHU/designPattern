package com.pzx.strategy;

import com.pzx.strategy.fly.FlyWithWings;
import com.pzx.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
