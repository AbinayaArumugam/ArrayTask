package com.arraytask;

public class IndexOfExtra {
    public static int findIndex(int[] arr1,int[] arr2,int size){
        for(int i=0;i<arr2.length;i++){
            if(arr1[i]!=arr2[i]){
                return i;
            }
        }
        return size-1;
    }
}

