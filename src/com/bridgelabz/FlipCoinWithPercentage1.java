package com.bridgelabz;

import java.util.Scanner;

public class FlipCoinWithPercentage1 {
	public static void main(String[] args){
		double count;			
			int countheads=0,counttails=0;			
			Scanner input_count=new Scanner(System.in);
			System.out.println("Enter the number of time to flip a coin: ");
			float numOfTimes=input_count.nextInt();
			for(int i=0;i<numOfTimes;i++) {
				count=Math.random()*1;

			if(count<0.5) {
				counttails++;
			}	
			else {
			countheads++;
			}
			}
			double percentageOfTails=(counttails/numOfTimes)*100;
			double percentageOfHeads=(countheads/numOfTimes)*100;	
			System.out.println("percentage of tail is: " + percentageOfTails);
			System.out.println("percentage of head is: " + percentageOfHeads);
		
		}
}
