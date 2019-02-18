package behavioral.command.devices;

public class GarageDoor {
    public void up() {
        System.out.println("Garage door go up");
    }

    public void down() {
        System.out.println("Garage door go down");
    }

    public void stop() {
        System.out.println("Garage door was stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
