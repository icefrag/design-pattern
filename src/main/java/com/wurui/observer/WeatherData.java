package com.wurui.observer;

import java.util.List;
import java.util.Vector;

public class WeatherData implements Subject{
	private List<Observer> observers = new Vector<Observer>();
	private float temperature;
	private float humidity;
	private float pressure;
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature,humidity,pressure);
		}
	}
	
	
	public float getTemperature(){
		return this.temperature;
	}
	
	public float getHumidity(){
		return this.humidity;
	}
	
	public float getPressure(){
		return this.pressure;
	}
	
	public void changed(){
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		changed();
	}
}
