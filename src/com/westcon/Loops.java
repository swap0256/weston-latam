package com.westcon;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//five rows and five column stars
		for(int i=1;i<=5;i++){
			for(int j=1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
			if(i==j || i+j==6){
				System.out.print("#");
				
			}
			else{
				System.out.print(" ");
			}
			
			}
			System.out.println();
		}
		System.out.println();

		
		
		// ****To Break the loop*****
		
		for(int i=1; i<=5; i++){
			System.out.println("after 3 times break the loop");
			if(i==3){
				break;
			}
		}
		
		
		System.out.println();
		
		
		
		
		// ********star example for break statement
		for(int i=1;i<=5;i++){
			for(int j=1;j<=3;j++){
				if(i==3 && (j==2||j==3)){
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		//While loop
		
		int a=10;
		int count=1;
		while(a<=20)
		{
			
			
			System.out.println("java"+count);
			a+=5;
			count++;
		}
		
		
		System.out.println();
		
		
		// do-while loop
		int b=10;
		int count1=1;
		do
		{
			System.out.println("Selenium"+count1);
			b+=5;
			count1++;
		}
		while(b<20);
		
	}

}
