package com.casettalab.model;

import com.casettalab.strategies.fly.FlyBehavior;
import com.casettalab.strategies.quack.QuackBehavior;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void display() {

    };


}
