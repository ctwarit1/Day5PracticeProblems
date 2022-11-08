package com.bridgelabz;

import java.util.Scanner;

public class Factors5 {
	public static void main(String[] args){
		int n, i;
		Scanner value=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=value.nextInt();
		for(i=2;i*i<=n;i++) {
			while(n%i==0) {
				n=n/i;
				System.out.print( i + " ");
			}
			if(n>2)
			System.out.println(n);
		}
	}
}
