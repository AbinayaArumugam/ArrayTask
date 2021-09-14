package com.arraytask;

public class SearchInRotatedArray {
    public static int searchArray(int[] arr,int key){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key) {
              return i;
            }
            }
        return -1;
    }
}
