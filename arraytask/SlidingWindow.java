package com.arraytask;

public class SlidingWindow {
    public static int printMax(int[] arr,int key){

        int j,max=0;
        int[] temp=new int[arr.length];
        int k=0;
        for(int i=0;i<=arr.length-key;i++){
            max=arr[i];
            for(j=1;j<key;j++){
                if(arr[i+j]>max){
                    max=arr[i+j];
                }
            }
            temp[k++]=max;
        }
        for(int m=0;m<k;m++){
            arr[m]=temp[m];
        }

        return k;
    }
}
