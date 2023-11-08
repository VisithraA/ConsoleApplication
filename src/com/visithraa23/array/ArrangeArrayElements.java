package com.visithraa23.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeArrayElements {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int[] arr=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]");
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		int[] arrangedArray=arrangeArray(arr);
		
		System.out.println(Arrays.toString(arrangedArray));
	}
	static int[] arrangeArray(int[] arr) {
		
		Arrays.sort(arr);
		int [] array=new int[arr.length];
		int evenLength=arr.length%2==0?arr.length/2-1:arr.length/2;
		int odd=evenLength+1;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) 
				array[i]=arr[evenLength--];
			else 
				array[i]=arr[odd++];
		}
		return array;
	}
	
	
}






