package observerPatternWeather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject data) {
		this.weatherData = data;
		this.weatherData.registerObserver(this);
	}
	
	public void update(float t, float h, float p) {
		this.temperature = t;
		this.humidity = h;
		this.display();
	}
	
	public void display() {
		System.out.println("Current Conditions: " + this.temperature + " F degrees and "
				+ this.humidity + " % humidity");
	}
	
}
