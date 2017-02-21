package com.westcon;

public class ConstructorClass {

	String sName;
//	public ConstructorClass(){
//		
//		System.out.println("In Constructor");
//	}
	public static void main(String[] args) {
		
	ConstructorClass A = new ConstructorClass();
	ConstructorClass A2 = new ConstructorClass();
	
	System.out.println(A.sName);
	System.out.println(A2.sName);
	}
	
	public ConstructorClass(){
		sName = "John";
	}
	

}
