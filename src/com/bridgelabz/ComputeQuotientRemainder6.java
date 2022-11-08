package com.bridgelabz;

import java.util.Scanner;

public class ComputeQuotientRemainder6 {
	public static void main(String[] args){
		int num1, num2;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number1: ");
		num1=num.nextInt();
		System.out.println("Enter the number2: ");
		num2=num.nextInt();
		int qoutient=num1/num2;
		System.out.println("qoutient is: " + qoutient);
		int remainder = num1%num2;
		System.out.println("remainder is: " + remainder);
	}
}
