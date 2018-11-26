package com.wurui.factory;

public class NYStylePizzaStore extends PizzaStore{
	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}
		return null;
	}
}
