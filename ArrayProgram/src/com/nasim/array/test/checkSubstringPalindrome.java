package com.nasim.array.test;

public class checkSubstringPalindrome {

	public static void main(String[] args) {
		String s = "aba";

		printAllSubStrings(s, s.length());

	}

	public static void printAllSubStrings(String s, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			char[] temp = new char[n - i];
			int index = 0;
			for (int j = i; j < n; j++) {
				temp[index++] = s.charAt(j);
				System.out.println(temp);
				if (checkPalindrome(temp)) {
					System.out.println(true);
					count++;
				}

			}
		}
		System.out.println(count);
	}

	private static boolean checkPalindrome(char[] c) {

		String s = new String(c).trim();
		char[] c1 = s.toCharArray();
		int i = 0, j = c1.length - 1;

		while (i < j) {
			if (c1[i] == c1[j]) {
				i++;
				j--;
			} else if (c1[i] != c1[j]) {
				return false;
			}

		}
		return true;

	}

}
