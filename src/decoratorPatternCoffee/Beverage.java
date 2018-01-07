package decoratorPatternCoffee;

public abstract class Beverage {
	
	String description = "unknown beverage";
	public enum Size {TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	
	public String getDescription() {
		return this.description;
	}
	
	public void setSize(Size s) {
		this.size = s;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public abstract double cost();
}