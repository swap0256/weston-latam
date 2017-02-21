package com.westcon;

public class InheritanceClassA {
	
	//static int d=50;
	int c=10;
	
	public static void main(String[] args) {
		InheritanceClassA A = new InheritanceClassA();
		A.request1();
	}
	
	void request1(){
		int a = 24, b= 30;
		int c =a+b;
		System.out.println(c);
		System.out.println(this.c);
	}

}
