package com.nasim.array.test;

//{ Driver Code Starts
import java.io.*;

class Array {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			// size of array
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");

			// adding elements
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			Kadane obj = new Kadane();

			// calling maxSubarraySum() function
			System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends

class Kadane {
	int maxSubarraySum(int arr[], int n) {
		int max = 0;
		int max_cal = 0;
		for (int i = 0; i < arr.length; i++) {
			max_cal = max_cal + arr[i];
			if (max_cal > max)
				max = max_cal;
			if (max_cal < 0)
				max_cal = 0;
		}
		return max;

	}

}
