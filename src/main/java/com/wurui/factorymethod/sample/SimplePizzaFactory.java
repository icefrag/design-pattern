package com.wurui.factorymethod.sample;

import com.wurui.factorymethod.Pizza;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if("cheese".equals(type)){
			pizza = new CheesePizza();
		}else if("greek".equals(type)){
			pizza = new GreekPizza();
		}else{
			throw new RuntimeException("未知的type类型:" + type);
		}
		
		return pizza;
	}
}
