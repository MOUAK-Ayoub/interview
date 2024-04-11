package com.codingame.algorithms;

public class PiApproximation {

    public static double findPiApproximation(double[][] pts) {
        int count = 0;
        for (double[] point : pts) {
            double exp = (point[0] * point[0]) + (point[1] * point[1]);
            if (exp <= 1) {
                count++;
            }
        }
        double probability = 4 * ((double) count / pts.length);
        return  probability;
    }

    public static void main(String[] args) {
        System.out.println(findPiApproximation(randXYPoints()));
        System.out.println(Math.PI);
    }

    public static double[][] randXYPoints() {
        double[][] points = new double[10000][2];

        for (double[] point : points) {
            point[0] = Math.random();
            point[1] = Math.random();

        }
        return points;
    }
}
