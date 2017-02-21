package com.westcon;

public class ConstructorArg_Class {
	String sName;
	int age;
	public ConstructorArg_Class(String name) {
	
		sName = name;
	}
	
	ConstructorArg_Class(String name,int age) {
		sName = name;
		
		this.age = age;
	}
	public static void main(String[] args) {
		
		ConstructorArg_Class A = new ConstructorArg_Class("Hanley"); 
		ConstructorArg_Class A1 = new ConstructorArg_Class("Joey" , 23 );
		
		System.out.println(A.sName);
		System.out.println(A1.sName);
		System.out.println(A1.age);
		System.out.println(A.age);
	}

}
