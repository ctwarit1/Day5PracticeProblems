package com.bridgelabz;

import java.util.Scanner;

public class FuncProgWindchill {
	public static void main(String[] args){
		int t, v;
		Scanner values=new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		t=values.nextInt();
		System.out.println("Enter the wind speed(in miles per hour): ");
		v=values.nextInt();
		double w=35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v,0.16);
		if(t<50 && v<120 && v>3)
		System.out.println(w);
		else
			System.out.println("Entered values are not correct ");
	}
}
