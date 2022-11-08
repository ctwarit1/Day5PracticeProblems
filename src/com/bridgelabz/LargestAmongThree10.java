package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongThree10 {
public static void main(String[] args){
	int n1, n2, n3;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter Three Numbers: ");
	n1=num.nextInt();
	n2=num.nextInt();
	n3=num.nextInt();
	if(n1>n2 && n1>n3) 
		System.out.println(n1 + " is the largest number");
	else if(n2>n1 && n2>n3)
		System.out.println(n2 + " is the largest number");
	else 
		System.out.println(n3 + " Is the largest number");
}
}
