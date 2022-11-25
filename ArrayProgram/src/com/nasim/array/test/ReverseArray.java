package com.nasim.array.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

	// Complete the reverseArray function below.
	static int[] reverseArray(int[] a) {
		int n = a.length;
		int[] arr = new int[n];
		int j = 0;
		for (int i = n - 1; i >= 0; i--) {
			arr[j++] = a[i];
		}
		return arr;

	}

	private static final Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) throws IOException {

		int arrCount = scanner.nextInt();
		
		int[] arr = new int[arrCount];

		String[] arrItems = scanner.nextLine().split(" ");
	

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] res = reverseArray(arr);

	/*	for (int i = 0; i < res.length; i++) {
			bufferedWriter.write(String.valueOf(res[i]));

			if (i != res.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();*/

		scanner.close();
	}
}
