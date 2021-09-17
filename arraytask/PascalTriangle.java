package com.arraytask;

public class PascalTriangle {
    public static void printPascalTriangle(int size){
        int prev=1;
        System.out.print(prev);
        for(int i=1;i<=size;i++){
            int curr=(prev*(size-i+1))/i;
            System.out.print(","+curr);
            prev=curr;
        }
    }
}
/*for(int i=0;i<=size;i++){
         for(int j=0;j<=size-i;j++){
             System.out.print(" ");
         }int c=1;
         for(int k=1;k<=i;k++){
             System.out.print(c+" ");
             c=c*(i-k)/k;
         }
         System.out.println();
     }*/