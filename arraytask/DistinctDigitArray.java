package com.arraytask;

import java.util.Arrays;

public class DistinctDigitArray {
    public static void findDistinctDigit(int[] arr){
        int[] temp=new int[10];
        Arrays.fill(temp,0);
        int k=0;
        for(int i=0;i<arr.length;i++){
            while (arr[i]>0){
                int r  =arr[i]%10;
                temp[r]++;

                arr[i]=arr[i]/10;
            }
        }
        int l=0;
        for(int i=0;i<10;i++){
            if(temp[i]!=0){
                System.out.print(i+" ");
            }
        }

    }

}