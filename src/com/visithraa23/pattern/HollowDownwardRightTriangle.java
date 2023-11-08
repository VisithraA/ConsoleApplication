package com.visithraa23.pattern;

import java.util.Scanner;

public class HollowDownwardRightTriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
		System.out.println("\nhollowDownwardRightTriangle:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==n-1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}	
	}
	
}

