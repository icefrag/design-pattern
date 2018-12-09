package com.wurui.observer.injava;

import java.util.Observable;
import java.util.Observer;

import com.wurui.observer.DisplayElement;

public class CurrentConditionDispay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	
	public CurrentConditionDispay(){
	}
	
	public void display() {
		System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(Observable o, Object arg) {
		WeatherData weatherData = (WeatherData)o;
		temperature = weatherData.getTemperature();
		humidity = weatherData.getHumidity();
		display();
	}
}
