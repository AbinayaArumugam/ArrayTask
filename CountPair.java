package com.arraytask;

public class CountPair {
    public static int countPair(int[]arr, int sum){
      int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }
}
