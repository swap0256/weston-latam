package com.westcon;

public abstract class AbstractContract1 extends AbstractClassA {
	public void move(){
		System.out.println("Move South");
		System.out.println("Move North");
		System.out.println("Move East");
		System.out.println("Move West");
	}
	
	public void kick(){
		System.out.println("kick left");
		System.out.println("kick right");
	}
	
	public void punch(){
		System.out.println("Punch Face");
		System.out.println("Punch Nose");
	}
	
//	 abstract void throwWeb(){
//		 
//	 }
	
	abstract void throwWeb();
}
