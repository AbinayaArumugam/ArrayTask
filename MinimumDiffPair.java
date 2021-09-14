package com.arraytask;

import java.util.Arrays;

public class MinimumDiffPair {
    public static int minDiffPair(int[] arr){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<min){
                min=arr[i+1]-arr[i];
            }
        }

        return min;

    }
}
 /* int sub=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sub=Math.abs(arr[i]-arr[j]);
                if(sub<min){
                    min=sub;
                }
            }
        }
        return min;*/