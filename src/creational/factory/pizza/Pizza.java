package creational.factory.pizza;

import creational.factory.ingredient.Cheese;
import creational.factory.ingredient.Clams;
import creational.factory.ingredient.Dough;
import creational.factory.ingredient.Sauce;

import java.util.ArrayList;

public abstract class Pizza {

    Dough dough1;
    Sauce sauce1;
    Cheese cheese1;
    Clams clams1;

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25  minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
