package com.codingame.algorithms;

public class ClosestToZeroFinder {


    public static int findClosestToZero(int[] ints) {
        int min = ints[0];

        for (int i : ints) {
            if (Math.abs(i) < Math.abs(min)) {
                min = i;
            }
            if (Math.abs(i) == Math.abs(min)) {
                min = (i > 0) ? i : min;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{-1, 2, 5, 6};
        System.out.println(findClosestToZero(ints));


        ints = new int[]{-1, 2, 5, 6, 1};
        System.out.println(findClosestToZero(ints));
    }
}
