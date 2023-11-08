package com.visithraa23.pyramidpattern;

import java.util.Scanner;

public class Pyramid4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of pyramid");
		int n=s.nextInt();
		
		for(int i=0;i<n;i++) {
			int temp=n-1;
			for(int j=0;j<n;j++) {
				if(i+j>=n-1)
					System.out.print(j+1);
				else
					System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				
				if(i>=k)
					System.out.print(temp--);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}
