package com.codes;

public class largestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {12, 13, 1, 10, 34, 10};

	     int max = arr[0];

	     for(int i=0; i<arr.length; i++)
	     {
	       if(max < arr[i])
	       {
	          max = arr[i];
	       }

	     }

	    System.out.print(max); 

	}

}
