package com.arraytask;

public class RunLengthEncoding {
    public static String findRunLength(String str){
        String newStr="";
        for(int i=0;i<str.length();i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += "" + str.charAt(i)+count;
        }
        return newStr;
    }
}
