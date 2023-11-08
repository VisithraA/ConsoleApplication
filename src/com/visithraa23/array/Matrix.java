package com.visithraa23.array;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	static Scanner s=new Scanner(System.in);
	static int row,column;
	public static void main(String[] args) {
		
		System.out.println("Matrix1");
		int[][] array1=getMatrix();
		System.out.println("\nMatrix2");
		int[][] array2=getMatrix();
		int[][] matrixArray=matrixMultiple(array1,array2);
		
		//System.out.println(Arrays.deepToString(array1));
		//System.out.println(Arrays.deepToString(array2));
		//System.out.println(array1.length);
		//System.out.println(array2.length);
		
		//System.out.println(Arrays.deepToString(matrixArray));
		
		for(int i=0;i<matrixArray.length;i++) {
			for(int j=0;j<matrixArray[i].length;j++) {
				System.out.print(matrixArray[i][j]+" ");
			}
			System.out.println();
		}
	}

	 

	static int[][] getMatrix() {
		
		System.out.println("Enter the row of matrix");
		row=s.nextInt();
		System.out.println("Enter the Column of matrix");
		column=s.nextInt();
		int arr[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("Enter the element of arr["+i+"]["+j+"]");
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}
	
	static int[][] matrixMultiple(int[][] array1, int[][] array2) {
		int [][] mul=new int[array1.length][array2[0].length];
		for(int i=0;i<mul.length;i++) {
			for(int j=0;j<mul[i].length;j++) {
				for(int k=0;k<mul.length;k++) {
					mul[i][j]+=array1[i][k]*array2[k][j];
				}
			}
			
		}
		return mul;
	}
}
