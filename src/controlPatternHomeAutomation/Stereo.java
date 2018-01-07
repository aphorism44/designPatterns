package controlPatternHomeAutomation;

public class Stereo {
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
