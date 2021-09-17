package com.arraytask;

import java.util.Arrays;

public class UnionOfTwoArr {
    public static int findUnion(int[] arr1,int[] arr2){
        int[] temp=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            temp[k++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            temp[k++]=arr2[i];
        }
        Arrays.sort(temp);

        System.out.println();
        int l=0;
        for(int i=0;i<temp.length-1;i++){
            if(temp[i]!=temp[i+1]){
                temp[l++]=temp[i];
            }
        }
        temp[l++]=temp[temp.length-1];
        return l;
    }
}
