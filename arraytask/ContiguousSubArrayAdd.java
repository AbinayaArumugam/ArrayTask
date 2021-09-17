package com.arraytask;

public class ContiguousSubArrayAdd {
    public static int[] findSubArray(int[] arr,int sum){
        int k=0;
        int[] temp =new int[2];
        for(int i=0;i<arr.length;i++){
            long sumArr=0;
            for(int j=i;j< arr.length;j++){;
                sumArr+=arr[j];
                if(sumArr==sum){
                    temp[k++]=i+1;
                    temp[k++]=j+1;
                    return temp;
                }
            }
        }

        return temp;
    }
}
