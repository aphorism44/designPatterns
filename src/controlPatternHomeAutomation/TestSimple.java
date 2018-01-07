package controlPatternHomeAutomation;

public class TestSimple {

	public static void main(String[] args) {
		RemoteControlInvoker remote = new RemoteControlInvoker();
		Light l = new Light();
		LightOnCommand lightOn = new LightOnCommand(l);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		GarageDoor gd = new GarageDoor();
		GarageDoorOpenCommand gCommand = new GarageDoorOpenCommand(gd);
		
		remote.setCommand(gCommand);
		remote.buttonWasPressed();
		
	}

}
