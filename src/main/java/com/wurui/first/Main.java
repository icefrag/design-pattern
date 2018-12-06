package com.wurui.first;

public class Main {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Duck readDuck = new ReadheadDuck();
		
		mallardDuck.display();
		readDuck.display();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
	}
}
