package com.nasim.array.test;

public class CommonElements {

	public static void main(String[] args) {
		
		int x[]= {3,6,9,12,15,18,20,31,35};
		int y[]= {2,9,13,20,35};
		int z[]= {1,8,20,25,20,35,40,55,67,79};
        commonElement(x,y,z);
        System.out.println(Math.sqrt(25));
	}

	private static void commonElement(int[] x, int[] y, int[] z) {
		int i=0,j=0,k=0;
		while(i<x.length && j<y.length && k<z.length) {
			if (x[i]==y[j] && y[j]==z[k]) {
				System.out.println("common elememt:"+x[i]);
				i++;
				j++;
				k++;
			}
			else if(x[i]<y[j]) {
					i++;
			}
			else if(y[j]<z[k]) {
				j++;
			}
			else  {
				k++;
			}
	
			
		}
		
	}

}
