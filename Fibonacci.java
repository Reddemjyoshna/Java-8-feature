package com.codes;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n1=0, n2=1, n3,n4=7;
			System.out.println(n1+"add"+n2);
			for (int i=0; i<n4; i++){
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			}
			System.out.println("print fibonacci no:"+n2);

	}

}
