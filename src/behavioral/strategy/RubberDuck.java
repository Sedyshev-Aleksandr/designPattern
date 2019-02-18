package behavioral.strategy;

public class RubberDuck extends Duck {
    public void quack() {
        System.out.println("RubberDuck. NOT quack()");
    }
    public void display() {
        System.out.println("RubberDuck. display()");
    }

    public void fly() {
        System.out.println("RubberDuck. NOT fly()");
    }
}
