package controlPatternHomeAutomation;

public class Light {
	private boolean on = false;
	
	public void on() {
		this.on = true;
		System.out.println("The light is on!");
	}
	
	public void off() {
		this.on = false;
		System.out.println("The light is off.");
	}
}
