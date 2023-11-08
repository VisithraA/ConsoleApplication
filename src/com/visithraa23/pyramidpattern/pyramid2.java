package com.visithraa23.pyramidpattern;

import java.util.Scanner;

public class pyramid2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of pyramid");
		int n=s.nextInt();
		int temp=n;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<n;k++)
				System.out.print(temp+" ");
			System.out.println();
			temp--;
		}
	}
}
