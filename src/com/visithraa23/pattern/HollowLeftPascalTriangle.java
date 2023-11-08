package com.visithraa23.pattern;

import java.util.Scanner;

public class HollowLeftPascalTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
		System.out.println("\nhollowLeftPascalTriangle:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<=j&&i+j>=n-1&&(j==n-1||i==j||i+j==n-1)) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
