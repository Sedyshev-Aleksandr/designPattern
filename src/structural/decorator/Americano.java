package structural.decorator;

public class Americano extends Beverage {
    public Americano() {
        description = "Americano";
    }

    public double cost() {
        return 3;
    }
}
