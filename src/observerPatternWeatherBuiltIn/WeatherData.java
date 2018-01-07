package observerPatternWeatherBuiltIn;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {}
	
	public void measurementChanged() {
		this.setChanged();
		this.notifyObservers();
	}
	
	public void setMeasurements(float t, float h, float p) {
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		this.measurementChanged();
	}
	
	public float getTemperature() {
		return this.temperature;
	}
	
	public float getHumidity() {
		return this.humidity;
	}
	
	public float getPressure() {
		return this.pressure;
	}
		
	
}
