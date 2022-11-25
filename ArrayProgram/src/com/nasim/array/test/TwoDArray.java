package com.nasim.array.test;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] arrA = {{1, 2, 9}, {3, 4, 8}, {5, 6, 7}};

        // {1, 2, 9}
		// {3, 4, 8}
		// {5, 6, 7}
		// {1, 2, 9, 5}
		// {3, 4, 8, 3}
		// {5, 6, 7, 1}

		//printMatrix(arrA);

		int[][] arrB = {{1, 2, 9, 5}, {3, 4, 8, 3}, {5, 6, 7, 1}};
        System.out.println(arrB[0].length);

		int[][] arrC=matrixMultipication(arrA, arrB);
		printMatrix(arrC);
    }

	private static void printMatrix(int[][] arrA) {
		for (int i = 0; i < arrA.length; i++)
			for (int j = 0; j < arrA[i].length; j++)
				System.out.println("arr[" + i + "][" + j + "] = " + arrA[i][j]);
	}

	private static int[][] matrixMultipication(int[][] arrA, int[][] arrB) {
       int[][] arrC=new int[arrA.length][arrB[0].length];
        for(int i=0;i<arrA.length;i++)
        	for(int j=0;j<arrB[0].length;j++){
        		arrC[i][j]=0;
        		for(int k=0;k<arrA[0].length;k++){
        			arrC[i][j]=arrC[i][j]+arrA[i][k]*arrB[k][j];
				}
			}
        return arrC;
    }

}
