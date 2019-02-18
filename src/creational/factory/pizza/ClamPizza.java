package creational.factory.pizza;

import creational.factory.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough1 = ingredientFactory.createDough();
        sauce1 = ingredientFactory.createSauce();
        cheese1 = ingredientFactory.createCheese();
        clams1 = ingredientFactory.createClam();
    }
}
