package com.function;

import java.util.Scanner;

public class AnyBaseAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int d = getSum(b, n1,n2);
		System.out.println(d);
	}

	public static int getSum(int b, int n1, int n2) {
		int rv = 0;
		int c = 0;
		int p = 1;
		while(n1>0||n2>0||c>0) {
			int d1 = n1 %10;
			int d2 = n2 % 10;
			
			n1 = n1/10;
			n2 = n2/10;
			
			int d = d1+d2+c;
			c = d/8;
			d = d %8;
			
			rv += d * p;
			p = p*10;
		}
		return rv;
	}

}
