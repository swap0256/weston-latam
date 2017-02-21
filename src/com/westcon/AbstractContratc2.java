package com.westcon;

public  class AbstractContratc2 extends AbstractClassA{

	void throwWeb(){
		System.out.println("Throw web and swing");
	}
	
	public static void main(String[] args) {
		AbstractContratc2 ac = new AbstractContratc2();
		ac.move();
		ac.kick();
		ac.punch();
		ac.throwWeb();

//		new AbstractContratc2().kick();
	}
}