package com.nasim.array.test;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {

		int x[] = { 4, -6, 8, -9, 1, 23, -5, 2 };

		System.out.println(getLargestSum(x));

	}

	private static int getLargestSum(int[] x) {
		int currMax = x[0];
		int maxSoFar = x[0];
		for (int i = 1; i < x.length; i++) {

			currMax = x[i] > currMax + x[i] ? x[i] : currMax + x[i];

			maxSoFar = maxSoFar > currMax ? maxSoFar : currMax;
		}
		return maxSoFar;
	}

}
