package com.nasim.array.test.dp;

public class SubArrayWithGivenSum {
    Boolean z;
    public static void main(String[] args) {

        int x[] = { 4, 6 };

        subArrayWithGivenSum(x, 10);

        SubArrayWithGivenSum s=new SubArrayWithGivenSum();

        System.out.println("Sum available for ");


    }

    private static void subArrayWithGivenSum(int[] x, int sum) {
        int t[][]=new int[x.length+1][sum+1];
        for(int i=0;i<=x.length;i++)
                    t[i][0] = 1;
            for(int j=1;j<=sum;j++)
                    t[0][j] = 0;

        for(int i=1;i<=x.length;i++){
            for(int j=1;j<=sum;j++){
                if(x[i-1]<=j){
                    t[i][j]=t[i-1][j-x[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }

            }
        }
        System.out.println("Total number of Sum available : "+t[x.length][sum]);

    }
}
