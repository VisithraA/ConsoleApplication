package com.visithraa23.pattern;

import java.util.Scanner;

public class HollowPyramid {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
		int k=n-1;
		System.out.println("\nhollowPyramid:\n");
		for(int i=0;i<n;i+=2) {
			for(int j=0;j<n;j++) {
				if(i==0||i==2*j||i+j==k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			k++;
		}
	}
}
