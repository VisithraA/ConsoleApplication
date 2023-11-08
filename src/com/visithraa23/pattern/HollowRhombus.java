package com.visithraa23.pattern;

import java.util.Scanner;

public class HollowRhombus {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
		int b=n;
		System.out.println("\nhollowRhombus:\n");
		for(int i=0;i<n;i++) {
			for(int k=b;k>0;k--)
				System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==n-1||j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
			b--;
		}
	}
}
