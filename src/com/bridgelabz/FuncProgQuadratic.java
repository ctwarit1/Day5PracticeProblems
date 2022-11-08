package com.bridgelabz;

import java.util.Scanner;

public class FuncProgQuadratic {
	public static void main(String[] args){
		int a, b, c;
		Scanner values=new Scanner(System.in);
		System.out.println("Enter a: ");
		a=values.nextInt();
		System.out.println("Enter b: ");
		b=values.nextInt();
		System.out.println("Enter c: ");
		c=values.nextInt();
		double delta= b*b - 4*a*c;
		System.out.println(delta);
		double root1= (-b + Math.sqrt(delta))/(2*a);
		double root2= (-b - Math.sqrt(delta))/(2*a);
		System.out.println("Two roots of the quadratic equations are: "+root1+" "+root2 );
		
	}

}
