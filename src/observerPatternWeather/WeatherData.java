package observerPatternWeather;

import java.util.ArrayList;
import java.util.Random;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int index = this.observers.indexOf(o);
		if (index >= 0)
			this.observers.remove(index);
	}
	
	public void notifyObservers() {
		for (Observer o: this.observers)
			o.update(this.temperature, this.humidity, this.pressure);
	}
	
	public void measurementChanged() {
		this.notifyObservers();
	}
	
	public void setMeasurements(float t, float h, float p) {
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
		this.measurementChanged();
	}
}
