package com.casettalab;

import com.casettalab.model.Duck;
import com.casettalab.strategies.fly.FlyRocketPowered;
import com.casettalab.model.MallardDuck;
import com.casettalab.model.ModelDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        System.out.println("\nDuck #2\n");

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
