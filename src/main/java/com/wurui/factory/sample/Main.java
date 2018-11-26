package com.wurui.factory.sample;

public class Main {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		pizzaStore.orderPizza("");
	}
}
