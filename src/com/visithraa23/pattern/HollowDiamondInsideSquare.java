package com.visithraa23.pattern;

import java.util.Scanner;

public class HollowDiamondInsideSquare {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pattern");
		int n=s.nextInt();
		
		System.out.println("\nhollowDiamondInsideSquare:\n");

        for(int i=1;i<=n;i++) {
            printLine(i,n);
        }

        for(int i=n-1;i>=1;i--) {
            printLine(i,n);
        }
    }

    static void printLine(int num, int n) {
        for(int i=1;i<=n-num+1;i++) {
            System.out.print("*");
        }

        for(int i=1;i<=2*num-2;i++) {
            System.out.print(" ");
        }

        for(int i=1;i<=n-num+1;i++) {
            System.out.print("*");
        }

        System.out.println();

	}
}
