package com.arraytask;


public class Rotate {
    public static int[] rotateArray(int[] arr,int k){
        int[] newArr=new int[arr.length];
        int j=0;
        for(int i=k;i<arr.length;i++){
            newArr[j++]=arr[i];
        }
        for(int i=0;i<k;i++){
            newArr[j++]=arr[i];
        }
        return newArr;
    }
}
