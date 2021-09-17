package com.arraytask;

public class InsertPosition {
    public static int findInsertPosition(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                return i;
            }
        }
        return arr.length;
    }
}
