package com.leetcode;

public class Prefix {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = null;
        for (String str : strs) {
            prefix = getPrefix(prefix, str);

        }

        return prefix;


    }

    public static String getPrefix(String prefix, String str) {

        if (prefix == null) {
            return str;
        }
        int minLength=Math.min(prefix.length(),str.length());
        str=str.substring(0,minLength);
        prefix=prefix.substring(0,minLength);

        while (!str.equals(prefix) && minLength != 0) {
            prefix = prefix.substring(0, minLength-1);
            str = str.substring(0, minLength-1);

            minLength--;
        }
        return prefix;

    }
}

