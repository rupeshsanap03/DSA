package com.function;

import java.util.Scanner;

public class DigitsFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int f = getDigitFrequency(n,d);
		System.out.println(f);

	}

	public static int getDigitFrequency(int n, int d) {
		// TODO Auto-generated method stub
		int rv = 0;
		while(n > 0) {
			int dig = n % 10;
			n = n/10;
			
			if(dig == d) {
				rv++;
			}
		}
		return rv;
	}

}
