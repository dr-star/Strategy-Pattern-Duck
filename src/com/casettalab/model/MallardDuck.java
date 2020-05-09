package com.casettalab.model;

import com.casettalab.strategies.fly.FlyWithWings;
import com.casettalab.strategies.quack.Quack;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}
