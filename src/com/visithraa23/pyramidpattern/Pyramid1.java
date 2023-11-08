package com.visithraa23.pyramidpattern;

import java.util.Scanner;

public class Pyramid1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of pyramid");
		int n=s.nextInt();
		int temp=1;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<n;k++)
				System.out.print(temp+" ");
			System.out.println();
			temp++;
		}
	}

}
