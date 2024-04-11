package com.codingame.algorithms;

public class LargestElement {


    public static int findLargest(int[] ints) {

        int max = ints[0];
        for (int i : ints) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{0, 12, 54, 1, 2, 5, 54, 1};
        System.out.println(findLargest(ints));

         ints = new int[]{1544777777,0, 12, 54, 1, 2, 5, 789794, 1};
        System.out.println(findLargest(ints));
        ints = new int[]{1544777777,0, 12, 54, 1, 2, 5, 789794, 1,1999999999};
        System.out.println(findLargest(ints));
        ints = new int[]{Integer.MIN_VALUE};
        System.out.println(findLargest(ints));
    }
}
