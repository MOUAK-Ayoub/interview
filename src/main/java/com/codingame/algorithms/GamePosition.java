package com.codingame.algorithms;

public class GamePosition {
    public static int getPosition(int n){

        int[] positions = new int[]{0,1,-1,-4,-5,-3};

        int position=positions[n%6];
        return position;
    }
    public static void main(String[] args) {


        int positiony= getPosition(12);
        System.out.println(positiony);
    }
}
