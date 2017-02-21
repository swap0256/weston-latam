package com.westcon;

public class Static_NonStatic {
	static int p = 20;
	static int q = 30;
	
	int x = 40;
	int y = 50;
	
	String sName;
	public static void main(String[] args) {
	
	//To access Static Members 
		
	System.out.println(p);						// one way 
	System.out.println(Static_NonStatic.p);  	// second way
	
	// To Access Non-Static Members
	
	Static_NonStatic non = new Static_NonStatic();
	Static_NonStatic non2 = new Static_NonStatic();
	
	System.out.println(non.x);
	System.out.println(non.y);
	
	non.sName ="John";
	
	System.out.println(non.sName);
	
	System.out.println(non2.sName);
	
	
	
	}
	
	
	

}
