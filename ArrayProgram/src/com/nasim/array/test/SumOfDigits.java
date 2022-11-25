package com.nasim.array.test;

import java.util.Arrays;

public class SumOfDigits {

	public static void main(String[] args) {

		int[] x = { 459, 67, 234, 589 };
		
		//Arrays.sort(x);
		
		//System.out.println(x[0]);

		printSum(x);

	}

	private static void printSum(int[] x) {
		
		for (int m = 0; m < x.length; m++) {
			int temp = x[m];
			int sum = 0;
			while (true) {
				sum += temp % 10;
				temp = temp / 10;
				if (temp < 10) {
					sum = sum + temp;
					System.out.println(sum);
					break;
				}

			}
		}

	}

}
