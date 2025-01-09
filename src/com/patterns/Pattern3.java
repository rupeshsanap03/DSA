package com.patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int st = 1;
		int sp = n - 1;
		for (int i = 0 ; i < n ; i++) {
			//System.out.println(st +""+ sp);
			for(int j = 0; j < sp; j++) {
				System.out.print("\t");
			}
			for(int j = 0; j < st; j++) {
				System.out.print("*\t");
			}
			sp--;
			st++;
			System.out.println();
		}
	}

}
