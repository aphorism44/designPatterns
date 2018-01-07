package controlPatternHomeAutomation;

public class LightOffCommand implements Command {
	
	Light light;
	
	public LightOffCommand(Light l) {
		this.light = l;
	}
	
	public void execute() {
		light.off();
	}
	
}
