package com.arraytask;

public class KadanesAlgorithm {
    public static int maxSubArrSum(int[] arr){
        int max=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
