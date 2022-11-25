package com.nasim.array.test;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int x[] = { 23, 16, 99, -71, -15, 18, 75, 31, 35 };
		//secondSmallest(x);
		ArrayList al=new ArrayList();
		al.add(4);
		al.add(14);
		al.add(24);
		al.add(34);
		System.out.println("ArrayList:"+al);
		al.remove(2);
		System.out.println("ArrayList:"+al);
		int y=2&1;
		System.out.println(y);

	}

	private static void secondSmallest(int[] x) {
		int smallest = x[0], seconsmall = x[0];
		for (int i = 0;i<x.length; i++) {
			if (x[i] < smallest) {
				smallest = x[i];
			}
			if(x[i]>smallest&& x[i]<seconsmall) {
				seconsmall=x[i];
			}

		}
		System.out.println("second Smallest:"+seconsmall);
	}

}
