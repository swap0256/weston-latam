package com.westcon;

public class MethodOverridingClassB extends MethodOverridingClassA{

	public void move(){
		System.out.println("Move North");
	}
	
	public void kick(){
		System.out.println("kick right");
		System.out.println("Kick left");
	}
	
	public static void main(String[] args) {
		MethodOverridingClassB b = new MethodOverridingClassB();
		b.punch();
		
	}
}
