package com.casettalab.strategies.quack;

import com.casettalab.strategies.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUAACK!");
    }
}
