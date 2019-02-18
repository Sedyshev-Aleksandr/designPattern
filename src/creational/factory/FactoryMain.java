package creational.factory;

import creational.factory.pizza.Pizza;
import creational.factory.store.ChicagoPizzaStore;
import creational.factory.store.NYPizzaStore;
import creational.factory.store.PizzaStore;

public class FactoryMain {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza =  nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() +  "\n");

        pizza =  chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() +  "\n");
    }
}
