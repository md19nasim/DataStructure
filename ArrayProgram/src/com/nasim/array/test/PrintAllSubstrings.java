package com.nasim.array.test;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		String s = "NasimALam";
		
		char[] temp = new char[3];
		temp[0]=s.charAt(0);
		temp[1]=s.charAt(1);
		temp[2]=s.charAt(2);
		//System.out.println(temp);
  
		printAllSubStrings(s, s.length());

	}

	public static void printAllSubStrings(String s, int n) {
		for (int i = 0; i < n; i++) {
			char[] temp = new char[n - i];
			int tempindex = 0;
			for (int j = i; j < n; j++) {
				temp[tempindex++] = s.charAt(j);
				System.out.print(temp);
				System.out.print("|");
			}
		}
	}

}
