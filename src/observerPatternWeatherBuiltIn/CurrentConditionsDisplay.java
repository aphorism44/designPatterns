package observerPatternWeatherBuiltIn;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable obs) {
		this.observable = obs;
		this.observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)arg;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}
	}
	
	public void display() {
		System.out.println("Current Conditions: " + this.temperature + " F degrees and "
				+ this.humidity + " % humidity");
	}
	
}
