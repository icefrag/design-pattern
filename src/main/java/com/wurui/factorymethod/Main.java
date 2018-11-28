package com.wurui.factorymethod;

public class Main {
	public static void main(String[] args) {
		PizzaStore store = new NYStylePizzaStore();
		PizzaStore store2 = new ChicagoStylePizzaStore();
	}
}
