package com.bridgelabz;

import java.util.Scanner;

public class EvenOddCheck8 {
	public static void main(String[] args){
		int n;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		n=num.nextInt();
		if(n%2==0) {
			System.out.println(n + " is EVEN");
			
		}
		else {
			System.out.println(n + " is ODD");
		}
		
	}

}
