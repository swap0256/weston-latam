package com.westcon;

public class Methods {

	public static void main(String[] args) {
		System.out.println("1. >>>>>>In Main Method");
		//calling a static method
		request();
		System.out.println("Calling 2nd method");
		//calling another static method
		request2();
		System.out.println("Calling 3rd method");
		//calling non static method in static method (by creating an object of a class)
		Methods obj = new Methods();
		obj.request3();
	}
	
	public static void request()
	{
		System.out.println("2. >>>>>>>>Response");
	}

	
	static void request2(){
		
		System.out.println("3. >>>>>>>>Response 2");
		
	}
	
	int request3(){
		int amount = 500;
		int balance =5000;
		
		if(amount<=balance){
			System.out.println("Please take your cash");
			balance-=amount;
			
			System.out.println("Total balance left :"+balance);
	
		}
		else{
			System.out.println("Amount entered"+amount+" is less than your current balance:"+balance);
		}
		return balance;
	}
	
}
