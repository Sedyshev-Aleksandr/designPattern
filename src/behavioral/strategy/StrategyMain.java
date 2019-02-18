package behavioral.strategy;

import behavioral.strategy.fly.FlyWithWings;
import behavioral.strategy.quack.Quack;

public class StrategyMain {
    public static void main(String[] args) {
        Duck duck = new  MallardDuck(new FlyWithWings(),new Quack());
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }

}
