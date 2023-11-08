package com.visithraa23.pattern;

import java.util.Scanner;

public class HollowDiamond {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
		System.out.println("\nhollowDiamond:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) 
				System.out.print(" ");
			for(int j=0;j<2*i+1;j++) {
				if(j==0||j==2*i)
					System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();
		
		}
		
		for(int i=n-2;i>=0;i--) {
			for(int j=0;j<n-i-1;j++)  
				System.out.print(" ");
			for(int j=0;j<2*i+1;j++) {
				if(j==0||j==2*i)
					System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();
		}
		
	}
}
