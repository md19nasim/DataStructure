package com.nasim.array.test;

import java.util.Arrays;

public class OddDescendingEvenAscending {

	public static void main(String[] args) {
		int[] input = { 4, 5, 2, 9, 15, 6, 78, 19, 10 };
		printOddDescendingEvenAscending(input);
	}

	private static void printOddDescendingEvenAscending(int[] input) {
		int i = 0;
		while (i < input.length) {
			if ((input[i] % 2) != 0) {
				input[i] = input[i] * -1;
			}
			i++;
		}
		Arrays.sort(input);
		for (int j = 0; j < input.length; j++) {
			if (input[j] < 0) {
				input[j] *= -1;
			}
			System.out.println(input[j]);
		}

	}

}
