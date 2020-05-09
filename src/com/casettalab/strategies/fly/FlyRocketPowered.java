package com.casettalab.strategies.fly;

import com.casettalab.strategies.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with ROCKET!");
    }
}
