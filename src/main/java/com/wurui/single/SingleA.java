package com.wurui.single;

/**
 * 饱汉式
 * @author wurui
 *
 */
public class SingleA {
	private static SingleA singleA = new SingleA();
	
	private SingleA(){
		
	}
	
	public static SingleA getInstance(){
		return singleA;
	}
}
