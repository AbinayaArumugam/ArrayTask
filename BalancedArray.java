package com.arraytask;

public class BalancedArray {
    public static int balancedArr(int[] arr) {
        int sum1=0,sum2=0;
        int length=arr.length;
        for(int i=0;i<length;i++){
            if(i<length/2){
                sum1+=arr[i];
            } else if(i>=length/2){
                sum2+=arr[i];
            }
        }
        int res = Math.abs(sum1-sum2);
        return res;
    }
}
