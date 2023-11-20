package com.codes;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int year = 2020;

	     if (year % 400 == 0)
	       System.out.println (year + " is a Leap Year");

	     else if (year % 4 == 0 && year % 100 != 0)
	       System.out.println (year + " is a Leap Year");

	     else
	         System.out.println (year + " is not a Leap Year");

	}

}
