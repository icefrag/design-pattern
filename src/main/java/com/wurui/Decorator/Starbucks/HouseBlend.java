package com.wurui.Decorator.Starbucks;

public class HouseBlend extends Beverage{
	public HouseBlend(){
		description = "HouseBlend coffee";
	}
	
	@Override
	public double cost() {
		return .99;
	}
}
