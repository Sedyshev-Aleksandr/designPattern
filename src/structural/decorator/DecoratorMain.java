package structural.decorator;

import structural.decorator.condiments.Mocha;
import structural.decorator.condiments.Whip;

public class DecoratorMain {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}
