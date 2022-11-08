package com.bridgelabz;

import java.util.Scanner;

public class LeapYear2 {
public static void main(String[] args){
	int leap_year;
	Scanner year=new Scanner(System.in);
	System.out.println("Enter the year: ");
	leap_year=year.nextInt();
	if((leap_year%4==0) &&(leap_year%100!=0)||(leap_year%400==0)) {
		System.out.println(leap_year + " is a Leap Year");
	}
	else {
		System.out.println(leap_year + " is not a Leap Year");
	}
	}
}

