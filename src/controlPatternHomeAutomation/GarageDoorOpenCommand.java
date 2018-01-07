package controlPatternHomeAutomation;

public class GarageDoorOpenCommand implements Command {
	
	GarageDoor garage;
	
	public GarageDoorOpenCommand(GarageDoor g) {
		this.garage = g;
	}

	public void execute() {
		garage.up();
	}

}
