package com.nasim.array.test.dp;

public class SubArrayWithGivenSumUsingRecursion {
    public static void main(String[] args) {

        int x[] = { 4, 6, 8, 14, 10,12, 15, 2 };

        boolean k=new SubArrayWithGivenSumUsingRecursion().subArrayWithGivenSum(x, x.length,13);
        System.out.println("Sum:"+k);
    }

    private  boolean subArrayWithGivenSum(int[] x, int n,int sum) {
        //System.out.println("Sum"+sum);
        if(sum==0)
            return true;
        if(n==0)
            return false;
        if(x[n-1]<=sum)
            return subArrayWithGivenSum(x, n-1,sum-x[n-1]) || subArrayWithGivenSum(x, n-1,sum);
            return subArrayWithGivenSum(x, n-1,sum);
    }
}