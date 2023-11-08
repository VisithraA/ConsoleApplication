package com.visithraa23.array;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		
		if(str.length()%2!=0) {
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<str.length();j++) {
					if(i==j)
						System.out.print(str.charAt(i));
					else if(i+j==str.length()-1)
						System.out.print(str.charAt(j));
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("O");
		
	}
}
