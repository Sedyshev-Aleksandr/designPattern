package creational.factory;

import creational.factory.pizza.NYCheesePizza;
import creational.factory.pizza.NYGreekPizza;
import creational.factory.pizza.NYPepperoniPizza;
import creational.factory.pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new NYGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        }
        return pizza;
    }
}