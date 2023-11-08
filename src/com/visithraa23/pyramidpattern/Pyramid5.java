package com.visithraa23.pyramidpattern;

import java.util.Scanner;

public class Pyramid5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of pyramid");
		int n=s.nextInt();
		
		for(int i=0;i<n;i++) {
			int temp=1;
			for(int j=0;j<n;j++) {
				if(i+j>=n-1)
					System.out.print(temp++);
				else
					System.out.print(" ");
			}
			temp=temp-n-1;
			for(int k=0;k<i;k++ ) {
				if(i>=k)
					System.out.print(temp--);
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}
