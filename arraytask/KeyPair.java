package com.arraytask;

import java.util.Arrays;

public class KeyPair {
    public static boolean findKeyPair(int[] arr,int key){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==key){
                return true;
            } else if(arr[left]+arr[right]<key){
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
/*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==key){
                    return true;
                }
            }
        }
        return false;
        */