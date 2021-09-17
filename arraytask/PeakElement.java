package com.arraytask;

public class PeakElement {
    public static int findPeak(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==0&& arr[i]>=arr[i+1] ){
                return i;
            }
            else if(i==arr.length-1 && arr[i]>=arr[i-1]){
                return i;
            } else if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1]){
                return i;
            }
        }
        return 0;
    }
}
