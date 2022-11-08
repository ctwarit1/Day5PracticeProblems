package com.bridgelabz;

import java.util.Scanner;

public class SwappingTwoNumbers7 {
	public static void main(String[] args){
		int n1, n2, n3;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the values: ");
		n1=num.nextInt();
		n2=num.nextInt();
		System.out.println("Values before swapping are: " + n1 + " " + n2);
		n3=n1;
		n1=n2; 
		n2=n3;
		System.out.println("Values after swapping are: " + n1 + " " + n2);
	}

}
