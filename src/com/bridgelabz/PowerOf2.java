package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args){
		int n, power=1, i=0;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=num.nextInt();
		if(n>=0 && n<31)
			while(i<=n) {
				power=2* power;
				System.out.println(i + "=" + power);
				i++;
			}
		else
			System.out.println("Invalid number");
		
		
	}

}
