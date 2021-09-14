package com.arraytask;

public class MajorityElement {
    public static int findMajority(int[] arr) {
        int n = arr.length;
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int num = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    num++;
                }
                if (num > maxCount) {
                    maxCount = num;
                    index = i;
                }
            }
        }
            if (maxCount > n / 2)
                return (arr[index]);
            return -1;

    }
}