package behavioral.strategy.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Rubber Squeak");
    }
}
