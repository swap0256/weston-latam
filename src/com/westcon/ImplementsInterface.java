package com.westcon;

public class ImplementsInterface implements Interface{

	public void move(){
		System.out.println("move out of interface");
	}
	public static void main(String[] args) {
		ImplementsInterface i = new ImplementsInterface();
		i.move();
	}
}
