package com.codingame.algorithms;

public class ColisTri {

    public static String solve(int width, int height, int length, int mass) {
        String status = null;
        boolean isVolumeEncombant = (width * height * length) >= 1000000;
        boolean isLourd = mass >= 20;
        boolean isEncombrant = (width >= 150) || (height >= 150) || (length >= 150) || isVolumeEncombant;
        if (isLourd && isEncombrant) {
            status = "REJECTED";
        } else if (isLourd || isEncombrant) {
            status = "SPECIAL";
        } else  {
            status = "STANDART";

        }
        return status;
    }
}
