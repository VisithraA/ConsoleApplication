package com.visithraa23.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfWeight {
	static int sum,temp1,temp2;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int [] weight=new int[s.nextInt()];
		for(int i=0;i<weight.length;i++) {
			System.out.println("Enter the number "+ (i+1));
			weight[i]= s.nextInt();
		}
		
		//System.out.println(Arrays.toString(weight));
		
		int[] weightSum=findSum(weight);
		//System.out.println(Arrays.toString(weightSum));
		//Bubble Sort to sort the array
		for(int i=0;i<weight.length-1;i++) {
			for(int j=0;j<weight.length-1;j++) {
				if(weightSum[j]<weightSum[j+1]) {
					temp1=weightSum[j];
					weightSum[j]=weightSum[j+1];
					weightSum[j+1]=temp1;
					
					temp2=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=temp2;
				}
				if(weightSum[j]==weightSum[j+1]&&weight[j]<weight[j+1]) {
					temp1=weightSum[j];
					weightSum[j]=weightSum[j+1];
					weightSum[j+1]=temp1;
					
					temp2=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=temp2;
				}
			}
		}
		System.out.println("\n\nOutput:\n<Number,Weightage>");
		for(int i=0;i<weight.length;i++) {
			System.out.print("<"+weight[i]+","+weightSum[i]+"> ");
		}
	}
	
	
	public static int [] findSum(int [] n){
		int[] sums=new int[n.length];
		
		for(int i=0;i<n.length;i++) {
			sum=0;
			if(n[i]==Math.sqrt(n[i])*Math.sqrt(n[i]))
				sum+=5;
			if(n[i]%4==0&&n[i]%6==0)
				sum+=4;
			if(n[i]%2==0)
				sum+=3;
			
			sums[i]=sum;
		}
		
		return sums;
	}
	

	
}
