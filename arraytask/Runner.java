package com.arraytask;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the question ");
        int question= in.nextInt();
        switch (question){

            case 1:
                System.out.println("Enter the size ");
                int size1=in.nextInt();
                System.out.println("the Array elements consist of 0's and 1's");
                int[][] celebrity=new int[size1][size1];
                for(int i=0;i<size1;i++){
                    for(int j=0;j<size1;j++){
                        celebrity[i][j]=in.nextInt();
                    }
                }
                System.out.println(CelebrityProblem.findCelebrity(celebrity,size1));
                break;
            case 2:
                System.out.println("Enter the Array Length");
                int length2=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr2= new int[length2];
                for(int i=0;i<length2;i++) {
                    arr2[i] = in.nextInt();
                }
                int len=RemoveDuplicate.removeDuplicate(arr2,length2);
                for(int i=0;i<len;i++){
                    System.out.print(arr2[i]+" ");
                }
                break;
            case 3:
                System.out.println("Enter the Size");
                int size3=in.nextInt();
                System.out.println("Enter the Array element");
                int[] array1= new int[size3];
                for(int i=0;i<size3;i++) {
                    array1[i] = in.nextInt();
                }
                System.out.println("Enter the Array element");
                int[] array2= new int[size3-1];
                for(int i=0;i<size3-1;i++) {
                    array2[i] = in.nextInt();
                }
                System.out.println(IndexOfExtra.findIndex(array1,array2,size3));
                break;
            case 4:
                System.out.println("Enter the String");
                String str=in.next();
                System.out.println(RunLengthEncoding.findRunLength(str));
                break;
            case 5:
                System.out.println("Enter the array1 length");
                int len1=in.nextInt();
                System.out.println("Enter the array elements");
                int[] arra1=new int[len1];
                for(int i=0;i<len1;i++){
                    arra1[i]=in.nextInt();
                }
                System.out.println("Enter the array2 length");
                int len2=in.nextInt();
                System.out.println("Enter the array elements");
                int[] arra2=new int[len2];
                for(int i=0;i<len2;i++){
                    arra2[i]=in.nextInt();
                }
                System.out.println(UnionOfTwoArr.findUnion(arra1,arra2));
                break;
            case 6:
                System.out.println("Enter the array1 length");
                int len6=in.nextInt();
                System.out.println("Enter the array elements");
                int[] arr6=new int[len6];
                for(int i=0;i<len6;i++){
                    arr6[i]=in.nextInt();
                }
                System.out.println("Enter the Key");
                int key6 = in.nextInt();
                boolean result = KeyPair.findKeyPair(arr6,key6);
                if(result){
                    System.out.println("Yes");
                } else{
                    System.out.println("No");
                }
                break;
            case 7:
                System.out.println("Enter the Size");
                int size7=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr7= new int[size7];
                for(int i=0;i<size7;i++) {
                    arr7[i] = in.nextInt();
                }
                System.out.println(PeakElement.findPeak(arr7));
                break;
            case 8:
                System.out.println("Enter the Size");
                int size8=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr8= new int[size8];
                for(int i=0;i<size8;i++) {
                    arr8[i] = in.nextInt();
                }
                System.out.println(JumpGame.findJump(arr8));
                break;
            case 9:
                System.out.println("Enter the Size");
                int size9=in.nextInt();
                PascalTriangle.printPascalTriangle(size9);
                break;
            case 10:
                System.out.println("Enter the Size");
                int size10=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr10= new int[size10];
                for(int i=0;i<size10;i++) {
                    arr10[i] = in.nextInt();
                }
                System.out.println("Enter the target");
                int target=in.nextInt();
                System.out.println(InsertPosition.findInsertPosition(arr10,target));
                break;
            case 11:
                System.out.println("Enter the Size");
                int size11=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr11= new int[size11];
                for(int i=0;i<size11;i++) {
                    arr11[i] = in.nextInt();
                }
                System.out.println("Enter the key");
                int key11=in.nextInt();
                int newLen=SlidingWindow.printMax(arr11,key11);
                for(int i=0;i<newLen;i++) {
                    System.out.print(arr11[i]+" ");
                }
                break;
            case 12:
                System.out.println("Enter the arrayLength");
                int length=in.nextInt();
                System.out.println("Enter the array element");
                int[] arr=new int[length];
                for(int i=0;i<length;i++){
                    arr[i]=in.nextInt();
                }
                DistinctDigitArray.findDistinctDigit(arr);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
