package com.westcon;

public class MethodsWithArgs {

	public static void main(String[] args) {
		
		move(8,"North");

		MethodsWithArgs test = new MethodsWithArgs();
		test.move(8, "North");
		test.move1(15, "South");
	}
	
	static void move(int a, String b){
		System.out.println("move "+a+" steps in "+b+" direction");
		
	}
	
	static void move1(int a, String b){
		System.out.println("move "+a+" steps in "+b+" direction ");
	}
	
}
