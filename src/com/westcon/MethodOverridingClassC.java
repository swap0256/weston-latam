package com.westcon;

public class MethodOverridingClassC extends MethodOverridingClassB{

//	public void punch(){
//		System.out.println("Punch Nose");
//	}
	
	public static void main(String[] args) {
		MethodOverridingClassC c = new MethodOverridingClassC();
		c.kick();
		c.move();
		c.punch();
	}
}
