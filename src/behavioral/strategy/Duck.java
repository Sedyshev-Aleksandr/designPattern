package behavioral.strategy;

import behavioral.strategy.fly.FlyBehavior;
import behavioral.strategy.quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("Duck. swim()");
    }
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }

}
