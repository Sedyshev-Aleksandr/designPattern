package behavioral.command;


import behavioral.command.commands.*;
import behavioral.command.devices.CeilingFan;
import behavioral.command.devices.GarageDoor;
import behavioral.command.devices.Light;
import behavioral.command.devices.Stereo;

public class CommandMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLighOff = new LightOffCommand(kitchenLight);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorUpCommand garageUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDown = new GarageDoorDownCommand(garageDoor);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn, kitchenLighOff);
        remoteControl.setCommand(2,garageUp, garageDown);
        remoteControl.setCommand(3,stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommand(4,ceilingFanHighCommand, ceilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed(4);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        System.out.println(remoteControl);


    }
}
