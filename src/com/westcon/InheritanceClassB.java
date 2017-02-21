package com.westcon;

public class InheritanceClassB extends InheritanceClassA{
	
	static int c= 30;
	
	public static void main(String[] args) {
	
		InheritanceClassA A = new InheritanceClassA();
		A.request1();
		System.out.println(A.c);
		System.out.println(c);
		//System.out.println(A.d);
		
		InheritanceClassB B = new InheritanceClassB();
		B.request2();
		B.request1();
	}
	
	void request2(){
		int a = 50, b=70;
		int c = b-a;
		System.out.println(c);
		System.out.println(this.c);
	}

}
