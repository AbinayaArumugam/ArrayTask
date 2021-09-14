package com.arraytask;

public class MinimumDistance {
   public static int minDist(int a[], int n, int x, int y) {
        int i=0,p=-1;
        int min=Integer.MAX_VALUE;
        for( i=0;i<n;i++){
            if(a[i]==x||a[i]==y){
                if(p!=-1&& a[i]!=a[p]){
                    min=Math.min(min,i-p);
                }
                p=i;
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
