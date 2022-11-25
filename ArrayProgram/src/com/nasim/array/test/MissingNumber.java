package com.nasim.array.test;

public class MissingNumber {

    public static void main(String[] args) {

        int[] x = {4, 3, 6, 7, 1, 5};
        System.out.println("4^4:"+String.valueOf(4^4));
        System.out.println("4^5:"+String.valueOf(4^5));
        System.out.println("4^4:"+String.valueOf(4^4^4));
        System.out.println("4^5:"+String.valueOf(4^4^5));
        //System.out.println(findMissingNumber(x));
        System.out.println(1 ^ 2 ^3^ 4 ^ 5);
        int[] y = {4, 4, 3, 3, 3, 5, 5, 8, 9, 2, 7, 2, 3, 4, 8, 4, 9};
        System.out.println("Odd Occurance of number:" + findMissingNumber(y));
    }

    private static int findMissingNumber(int[] x) {

        int k = x[0];
        for (int i = 1; i < x.length; i++) {
            k = k ^ x[i];
        }
        return k;
    }

}
