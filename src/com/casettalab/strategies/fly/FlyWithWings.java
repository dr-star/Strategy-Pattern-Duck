package com.casettalab.strategies.fly;

import com.casettalab.strategies.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with wings!");
    }
}
