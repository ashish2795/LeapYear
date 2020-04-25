package com.leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		int year = sc.nextInt();
		
		boolean leapyear= leap(year);
		if(leapyear) {
			System.out.println(year + " year is leap year");
		}else {
			System.out.println(year + " year is not leap year");
		}
		
		sc.close();
	}
	
	public static boolean leap(int year) {
		
		boolean leap=false;
		    
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}else {
					leap = false;
				}					
			}else {
				leap = true;
			}
		}else {
			leap = false;
		}		 
		return leap;
	}
}
