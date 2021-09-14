package com.arraytask;

public class SmallerCount {
    public static int[] findCountSmallerThan(int[] arr){
        int[] newArr=new int[arr.length];
        int k=0;
        int count=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            newArr[k++]=count;
            count=0;
        }
        return newArr;
    }
}
