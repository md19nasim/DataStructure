package com.nasim.array.test;

import java.util.Arrays;
import java.util.List;


public class Segregate0And1 {

	public static void main(String[] args) {
		int x[] = { 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1 ,0};

		segregate(x);
		Integer y=0;
		int k=y;
		
		 String a[] = new String[] { "A", "B", "C", "D" }; 
		  
         // getting the list view of Array 
         List<String> list = Arrays.asList("hello" ,"hi");

         // printing the list 
         System.out.println("The list is: " + list);

	}

	private static void segregate(int[] x) {
		int j = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				x[j++] = 0;
			}
		}
		while (j < x.length) {
			x[j++] = 1;
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x);
			if(i!=x.length-1)
			System.out.print(",");
		}

	}
}
