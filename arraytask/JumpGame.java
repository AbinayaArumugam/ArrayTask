package com.arraytask;

public class JumpGame {
    public static int findJump(int[] arr){
        int end=0,farthest=0,jump=0;
        for(int i=0;i<arr.length-1;i++){
            farthest=Math.max(farthest,i+arr[i]);
            if(i==end){
                jump++;
                end=farthest;
            }
        }
        return jump;
    }
}
