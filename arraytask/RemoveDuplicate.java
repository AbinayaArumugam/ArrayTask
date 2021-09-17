package com.arraytask;

public class RemoveDuplicate {
    public static int removeDuplicate(int arr[],int size){
        if(size==0||size==1){
            return size;
        }
        int[] temp=new int[size];
        int k=0;
        for(int i=0;i<size-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[k++]=arr[i];
            }
        }
        temp[k++]=arr[size-1];

        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }

        return k;
    }
}
