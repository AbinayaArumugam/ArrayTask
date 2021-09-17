package com.arraytask;

public class LocalMinima {
    public static int findLocalMinima(int[] arr){
        int k=0;
        int newArr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==0&&arr[i]<=arr[i+1]&&arr[i]<=arr[arr.length-1]){
                newArr[k++]=arr[i];
            } else if(i==arr.length-1&&arr[i]<=arr[0]&&arr[i]<=arr[i-1]){
                newArr[k++]=arr[i];
            } else if(arr[i]<=arr[i+1]&&arr[i]<=arr[i-1]){
                newArr[k++]=arr[i];
            }
        }
        int l=0;
        for (int i=0;i<k;i++){
            arr[l++]=newArr[i];
        }
        return k;
    }
}
