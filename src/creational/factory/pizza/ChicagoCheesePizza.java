package creational.factory.pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name =  "Chicago Style Deep Dish Cheese pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
