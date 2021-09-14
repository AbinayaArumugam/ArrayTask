package com.arraytask;

public class WaveSort {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int[] waveSort(int[] arr){
        if(arr.length%2!=0) {
            for (int i = 0; i < arr.length - 1; i += 2) {
                swap(arr, i, i + 1);
            }
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                swap(arr, i, i + 1);
            }
        }
        return arr;
    }
}
