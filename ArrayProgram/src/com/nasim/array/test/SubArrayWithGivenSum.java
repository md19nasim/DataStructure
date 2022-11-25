package com.nasim.array.test;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int x[] = { 4, 6, 8, 9, 10, 23, 25, 27 };

		subArrayWithGivenSum(x, 19);

	}

	private static void subArrayWithGivenSum(int[] x, int sum) {

		int temp = 0;
		for (int i = 0, j = 1; i < x.length;) {
			while ((i+j)< x.length-1) {

				if (temp == sum) {
					System.out.println("Index{" + i + "," + j + "}");
					break;
				}
				if (temp > sum) {
					i++;
					j = 1;
				}
				if (temp < sum) {
					j++;
				}
				temp = temp + x[i + j];
			}
		}
	}

}
