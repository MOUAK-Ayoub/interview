package com.codingame.algorithms;

public class SearchMultiplesSum {

    public static int getMultipleSum(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                result += i;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        int number = 3;

        // 2 bit left shift operation
        int Ans = number << 2;

        System.out.println(Ans);
        System.out.println(getMultipleSum(11));
    }
}
