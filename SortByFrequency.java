package com.arraytask;

import java.util.Arrays;

public class SortByFrequency {
    public static int[] sortByFrequency(int[] arr){
        int max=0;
        int index=0;
        boolean[] visited=new boolean[arr.length];
        Arrays.fill(visited,false);
        int[] newArr= new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true)
                continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[i]=true;
                    count++;
                }
            }
            System.out.println(count);
        }
        return newArr;
    }
}
