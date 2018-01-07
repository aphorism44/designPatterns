package controlPatternHomeAutomation;

public class LightOnCommand implements Command {
	
	Light light;
	
	public LightOnCommand(Light l) {
		this.light = l;
	}
	
	public void execute() {
		light.on();
	}
	
}
