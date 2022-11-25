package com.nasim.array.test;

public class EvenOddFactorsMultiplier {

	public static void main(String[] args) {
		System.out.println(getevenOdd(5));
		//int x=getevenOdd(6);
		//System.out.println(x);
		
	}

	public static int getevenOdd(int number) {
		int x = 1;
		int length = number / 2;
		if (number % 2 == 0) {
			for (int i = 1; i <= length; i++)
				x = x * i * 2;
		} else {
			for (int i = length; i >= 0; i--)
				x = x * (number - 2 * i);
		}
		return x;

	}
}
