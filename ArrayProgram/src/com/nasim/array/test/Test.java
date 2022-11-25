package com.nasim.array.test;

public class Test{
    
    public static void main(String[] args){
        int[] a= {105, 27, 33, 7, 16, 5};
        int[] x=new int[100];
        
       // System.out.println(x[1]);
        
        for(int i=0;i<a.length;i++) {
        	if(a[i]<99) {
        		x[a[i]]=1;
        	}
        }
        
        for(int i=0;i<x.length;i++) {
        	if(x[i]==0)
        		System.out.println(i);
        }
        
    } 
    

}
