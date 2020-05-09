package com.casettalab.strategies.fly;

import com.casettalab.strategies.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly ):");
    }
}
