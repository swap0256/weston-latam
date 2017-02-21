package com.westcon;

public class AccessMemberB {
	static int a = 12;
	public static void main(String[] args) {
		
		// Accessing Static Members
		
		int c = a + AccessMemberA.k; 
		System.out.println(c);
		System.out.println(AccessMemberA.k);
		
		// Accessing Non-Static Members
		
		AccessMemberA A = new AccessMemberA();
		int c1 = a + A.j;
		System.out.println(c1);
		System.out.println(A.j);
		
	}

}
