package com.arraytask;

public class LeaderInArray {
    public static void findLeader(int[] arr){
        int[] newArr =new int[arr.length];
        int k=0;
        int max=arr[arr.length-1];
        newArr[k++]=max;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                newArr[k++]=max;
            }
        }
        for(int i=k-1;i>=0;i--){
            System.out.print(newArr[i]+" ");
        }
    }

}
