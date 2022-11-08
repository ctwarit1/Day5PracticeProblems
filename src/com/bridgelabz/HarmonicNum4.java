package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNum4 {
	public static void main(String[] args){
		int num, i;
		double result=0;
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the number, till you want harmonic series: ");
		num=value.nextInt();
		if(num>0)
			for(i=1;i<=num;i++) {
				result=1.0/i;
				System.out.println("Harmonic Series is: "+ result);
			}
		else {
			System.out.println("Number entered is less than zero");
		}		
	}
}
