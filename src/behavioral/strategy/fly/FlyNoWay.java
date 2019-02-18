package behavioral.strategy.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cant fly");
    }
}
