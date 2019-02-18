package behavioral.command.devices;

public class Light {
    private String nameLight;

    public Light(String nameLight) {
        this.nameLight = nameLight;
        System.out.println("Light in the " + this.nameLight);
    }

    public void on() {
        System.out.println("Light on the " + this.nameLight + " is on");
    }

    public void off() {
        System.out.println("Light on the " + this.nameLight + " is off");
    }
}
