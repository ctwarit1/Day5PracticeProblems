package com.bridgelabz;

import java.util.Scanner;

public class FuncProgDistance {
	public static void main(String[] args){
		int x1=0,y1=0;
		int x2=Integer.parseInt(args[0]);
		int y2=Integer.parseInt(args[1]);
//		Scanner values=new Scanner(System.in);
//		System.out.println("Enter x2: ");
//		x2=values.nextInt();
//		System.out.println("Enter y2: ");
//		y2=values.nextInt();
		double result=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Distance is "+ result);
	}

}
