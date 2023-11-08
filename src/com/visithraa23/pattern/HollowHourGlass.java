package com.visithraa23.pattern;

import java.util.Scanner;

public class HollowHourGlass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
	
		System.out.println("\nhollowHourGlass:\n");
        
        for(int i=1;i<n;i++) {
            for(int j=i;j<=n;j++) 
                System.out.print(" ");         
            for(int j=1;j<i;j++) 
                System.out.print("* ");           
            for(int j=1;j<=i;j++) {
                System.out.print("* ");                
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for (int j=1;j<i;j++) 
                System.out.print(" ");           
            for (int j=i;j<n;j++) 
            	System.out.print("*");
            for (int j=i;j<=n;j++) 
            	System.out.print("*");
               
            System.out.println();
        }
     }
}
