package com.visithraa23.pyramidpattern;

import java.util.Scanner;

public class Pyramid7 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of pyramid");
	int n=s.nextInt();
	
	for(int i=n-1;i>=0;i--) {
		int temp=1;
		for(int j=0;j<i;j++)
			System.out.print(" ");
		for(int k=i;k<n;k++) {
			if(temp<9)
				System.out.print(temp+++" ");
			else
				System.out.print(temp++);
		}
		System.out.println();
	}
}
}
