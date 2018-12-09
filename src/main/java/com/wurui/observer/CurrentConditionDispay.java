package com.wurui.observer;

public class CurrentConditionDispay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	
	public CurrentConditionDispay(){
	}
	
	public void display() {
		System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		
		display();
	}

}
