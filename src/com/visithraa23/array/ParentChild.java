
package com.visithraa23.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ParentChild {
	static Scanner s=new Scanner(System.in);
	static String parent;
	public static void main(String[] args) {
		String[][] str=getInput();
		
		//System.out.println(Arrays.deepToString(str));
		ArrayList<String> son=findSon(str);
		//System.out.println(son);
		
		int grandChild=findGrandChild(son, str);
		System.out.println("\n"+parent+" has "+grandChild+" grandChildren");
	}
	
	

	static String[][] getInput() {
		System.out.println("Enter the Number of Inputs");
		String[][] array=new String[s.nextInt()][2];
		
		for(int i=0;i<array.length;i++) {

			System.out.println("Enter the Child "+(i+1)+" name");
			array[i][0]=s.next();
			System.out.println("Enter the Parent "+(i+1)+" name");
			array[i][1]=s.next();
			
		}
		return array;
	}
	
	static ArrayList findSon(String[][] str) {
		
		System.out.println("Enter the GrandParent name");
		parent=s.next();
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(int i=0;i<str.length;i++) {
			if(str[i][1].equalsIgnoreCase(parent))
				al.add(str[i][0]);
		}
		return al;
	}
	
	static int findGrandChild(ArrayList<String> son,String[][] str) {
		int count=0;
		for(int i=0;i<son.size();i++) {
			for(int j=0;j<str.length;j++) {
				if(son.get(i).equalsIgnoreCase(str[j][1]))
					count++;
			}
		}
		return count;
		
	}
}










