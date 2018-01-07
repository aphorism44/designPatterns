package controlPatternHomeAutomation;

public class GarageDoor {

	private boolean doorOpen = false;
	private boolean lightOn = false;
	private boolean stopped = false;
	
	public void up() {
		this.stopped = false;
		this.doorOpen = true;
		System.out.println("The garage door has opened.");
	}
	
	public void down() {
		this.stopped = false;
		this.doorOpen = false;
		System.out.println("The garage door has closed.");
	}
	
	public void stop() {
		this.stopped = true;
		System.out.println("The garage door has stopped.");
	}
	
	public void lightOn() {
		this.lightOn = true;
		System.out.println("The garage light is on.");
	}
	
	public void lightOff() {
		this.lightOn = false;
		System.out.println("The garage light is off.");
	}
	

}
