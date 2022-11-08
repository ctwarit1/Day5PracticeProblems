package com.bridgelabz;

import java.util.Scanner;

public class FuncProgThreeIntSumZero {
	public static void main(String[] args){
		int i, j, k, n;
		Scanner values=new Scanner(System.in);
		System.out.println("Enter the size for array: ");
		n=values.nextInt();
		int array[]=new int[n];
		System.out.println("ENter the elemnts of array: ");
		for(i=0;i<n;i++) {
			array[i]=values.nextInt();
		}
		int three_int=0;
		for(i=0;i<n-2;i++) {
			for(j=0;j<n-1;j++) {
				for(k=0;k<n;k++) {
					System.out.println("Integer with sum zero are: ");
					int sum=array[i] +array[j] +array[k];
					if(sum==0) {
						three_int+=1;
						System.out.println("elements are: " + array[i]+ " " +array[j]+" " +array[k]);
					}
					
				}
			}
		}
		System.out.println(three_int);
		
	}

}
