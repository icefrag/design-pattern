package com.wurui.factorymethod;

public class NYStylePizzaStore extends PizzaStore{
	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}
		return null;
	}
}
