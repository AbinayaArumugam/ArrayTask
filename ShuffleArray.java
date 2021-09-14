package com.arraytask;

public class ShuffleArray {
    public static int[] shuffleArr(int[] arr, int key) {

        int[] newArr = new int[arr.length];
        int k = 0;
        int i = 0;
        int m=0;
        int j=key;
        for(i=0;i< arr.length;i++){
            if (i%2==0) {
                newArr[k++] = arr[m++];
            } else if(i%2!=0){
                newArr[k++] = arr[j++];
            }
        }
        return newArr;
    }
}
