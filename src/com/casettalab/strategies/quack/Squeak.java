package com.casettalab.strategies.quack;

import com.casettalab.strategies.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("SqUeAk");
    }
}
