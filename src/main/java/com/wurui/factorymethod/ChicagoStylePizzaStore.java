package com.wurui.factorymethod;

public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}
		return null;
	}

}
