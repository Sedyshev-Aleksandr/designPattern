package behavioral.strategy;

import behavioral.strategy.fly.FlyWithWings;
import behavioral.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(FlyWithWings flyAbility, Quack quackAbility) {
        quackBehavior = quackAbility;
        flyBehavior = flyAbility;
    }

    public void display() {
        System.out.println("MallarDuck. display()");
    }
}
