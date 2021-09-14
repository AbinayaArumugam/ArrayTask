package com.arraytask;

import java.util.Arrays;

public class AlternateSorting {
 public static void alternateSort(int[] arr){
     int max=arr.length-1;
     int min=0;
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
         if(i%2==0){
             System.out.print(arr[max--]+ " ");
         } else {
             System.out.print(arr[min++]+ " ");
         }
     }
 }
}
