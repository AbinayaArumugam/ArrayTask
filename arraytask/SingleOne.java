package com.arraytask;

import java.util.Arrays;

public class SingleOne {
    public static int findSingleOne(int[] arr){
        int[] temp=new int[10];
        Arrays.fill(temp,0);
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        for(int i=0;i< arr.length;i++){
            if(temp[i]==1){
                return i;
            }
        }
        return -1;
    }
}
