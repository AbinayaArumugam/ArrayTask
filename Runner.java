package com.arraytask;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the question ");
        int question= in.nextInt();
        switch (question){
            case 1:
                System.out.println("Enter the Array Length");
                int length1=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr1= new int[length1];
                for(int i=0;i<length1;i++){
                    arr1[i]=in.nextInt();
                }
                System.out.println("Enter the Number to rotate");
                int rotateBy=in.nextInt();
                int[] newArr=Rotate.rotateArray(arr1,rotateBy);
                for(int i=0;i<newArr.length;i++){
                    System.out.print(newArr[i]+" ");
                }
                break;
            case 2:
                System.out.println("Enter the Array Length");
                int length2=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr2= new int[length2];
                for(int i=0;i<length2;i++){
                    arr2[i]=in.nextInt();
                }
                int[] newArr2=SmallerCount.findCountSmallerThan(arr2);
                for(int i=0;i<newArr2.length;i++){
                    System.out.print(newArr2[i]+ " ");
                }
                break;
            case 3:
                System.out.println("Enter the Array Length");
                int length3=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr3= new int[length3];
                for(int i=0;i<length3;i++){
                    arr3[i]=in.nextInt();
                }
                System.out.println(KadanesAlgorithm.maxSubArrSum(arr3));
                break;
            case 4:
                System.out.println("Enter the Array Length");
                int length4=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr4= new int[length4];
                for(int i=0;i<length4;i++){
                    arr4[i]=in.nextInt();
                }
                int[] newArr4=WaveSort.waveSort(arr4);
                for(int i=0;i<newArr4.length;i++){
                    System.out.print(newArr4[i]+ " ");
                }
                break;
            case 5:
                System.out.println("Enter the Array Length");
                int length5=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr5= new int[length5];
                for(int i=0;i<length5;i++){
                    arr5[i]=in.nextInt();
                }
                AlternateSorting.alternateSort(arr5);
                break;
            case 6:
                System.out.println("Enter the Array Length");
                int length6=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr6= new int[length6];
                for(int i=0;i<length6;i++){
                    arr6[i]=in.nextInt();
                }
                System.out.println(MajorityElement.findMajority(arr6));
                break;
            case 7:
                System.out.println("Enter the Array Length");
                int length7=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr7= new int[length7];
                for(int i=0;i<length7;i++) {
                    arr7[i] = in.nextInt();
                }
                    System.out.println(SortByFrequency.sortByFrequency(arr7));
                    break;
            case 8:
                System.out.println("Enter the Array Length");
                int length8=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr8= new int[length8];
                for(int i=0;i<length8;i++) {
                    arr8[i] = in.nextInt();
                }
                System.out.println("Enter the Key");
                int key = in.nextInt();
                System.out.println(SearchInRotatedArray.searchArray(arr8,key));
                break;
            case 9:
                System.out.println("Enter the Array Length");
                int length9=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr9= new int[length9];
                for(int i=0;i<length9;i++) {
                    arr9[i] = in.nextInt();
                }
                System.out.println(BalancedArray.balancedArr(arr9));
                break;
            case 10:
                System.out.println("Enter the Array Length");
                int length10=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr10= new int[length10];
                for(int i=0;i<length10;i++) {
                    arr10[i] = in.nextInt();
                }
                System.out.println("Enter the key");
                int key10=in.nextInt();
                int[] newArr10=ShuffleArray.shuffleArr(arr10,key10);
                for(int i=0;i<newArr10.length;i++) {
                    System.out.print(newArr10[i]+" ");
                }
                break;
            case 11:
                System.out.println("Enter the Array Length");
                int length11=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr11= new int[length11];
                for(int i=0;i<length11;i++) {
                    arr11[i] = in.nextInt();
                }
                System.out.println("Enter the Sum");
                int sum=in.nextInt();
                System.out.println(CountPair.countPair(arr11,sum));
                break;
            case 12:
                System.out.println("Enter the Array Length");
                int length12=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr12= new int[length12];
                for(int i=0;i<length12;i++) {
                    arr12[i] = in.nextInt();
                }
                System.out.println(GoodPair.findCount(arr12));
                break;
            case 13:
                System.out.println("Enter the Array Length");
                int length13=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr13= new int[length13];
                for(int i=0;i<length13;i++) {
                    arr13[i] = in.nextInt();
                }
                System.out.println(MinimumDiffPair.minDiffPair(arr13));
                break;
            case 14:
                System.out.println("Enter the Array Length");
                int length14=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr14= new int[length14];
                for(int i=0;i<length14;i++) {
                    arr14[i] = in.nextInt();
                }
                LeaderInArray.findLeader(arr14);
                break;
            case 15:
                System.out.println("Enter the Array Length");
                int length15=in.nextInt();
                System.out.println("Enter the Array element");
                int[] arr15= new int[length15];
                for(int i=0;i<length15;i++) {
                    arr15[i] = in.nextInt();
                }
                System.out.println("Enter the number");
                int num1=in.nextInt();
                System.out.println("Enter the number");
                int num2=in.nextInt();
                System.out.println(MinimumDistance.minDist(arr15,length15,num1,num2));
                break;
        }
    }
}
