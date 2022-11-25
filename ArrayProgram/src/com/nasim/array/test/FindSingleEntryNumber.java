package com.nasim.array.test;

public class FindSingleEntryNumber {

	public static void main(String[] args) {

     int[] x= {5,5,8,8,2,9,9,1,1};
     
     findSingleEntryNumber(x);

	}

	private static void findSingleEntryNumber(int[] x) {
		
		int singleEntry=0;
		
		/*for(int i=0;i<x.length;i++) {
			singleEntry=singleEntry^x[i];
		}*/
		
		for(int y:x) {
			singleEntry=singleEntry^y;
		}
		System.out.println("Single Entry Number:"+singleEntry ); 
	}

}
