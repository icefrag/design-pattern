package com.wurui.single;
/**
 * 饿汉式
 * @author wurui
 *
 */
public class SingleB {
	volatile private static SingleB singleB = null;
	private SingleB(){
	}
	
	/**
	 * double check 
	 * @return
	 */
	public static SingleB getInstance(){
		if(singleB == null){
			synchronized (SingleB.class) {
				if(singleB == null){
					singleB = new SingleB();
				}
			}
		}
		
		return singleB;
	}
}
