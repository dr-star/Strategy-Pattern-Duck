package com.casettalab.model;

import com.casettalab.strategies.fly.FlyNoWay;
import com.casettalab.strategies.quack.MuteQuack;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model duck");
    }
}
