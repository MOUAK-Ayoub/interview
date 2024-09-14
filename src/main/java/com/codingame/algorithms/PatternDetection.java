package com.codingame.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatternDetection {


    public static int[] solve(int imageWidth, int imageHeight, String[] image, int patternWidth, int patternHeight,
                              String[] pattern) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        int[] result = new int[] { -1, -1 };

        boolean stop = false;
        for (int j = 0; j <= imageHeight - patternHeight; j++) {

            for (int i = 0; i <= imageWidth - patternWidth; i++) {

                if (isPatternInSubImage(image, i, j, pattern, patternWidth, patternHeight)) {
                    result[0] = i;
                    result[1] = j;
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }
        return result;
    }

    public static boolean isPatternInSubImage(String[] image, int x_index, int y_index, String[] pattern,
                                              int patternWidth, int patternHeight) {
        String[] subImage = calculateSubImage(image, x_index, y_index, patternWidth, patternHeight);

        return Arrays.equals(subImage, pattern);
    }

    public static String[] calculateSubImage(String[] image, int x_index, int y_index, int patternWidth,
                                             int patternHeight) {
        String[] subImage = new String[patternHeight];
        String[] subImageY = Arrays.copyOfRange(image, y_index, y_index + patternHeight);
        for (int i = 0; i < subImageY.length; i++) {
            subImage[i] = subImageY[i].substring(x_index, x_index + patternWidth);
        }

        return subImage;
    }

    public static void main(String[] args) {
        String[] image  = new String []{"1237","4546","1479","4548","1769"};
        String[] pattern  = new String []{"46","79","48"};

        System.out.println(Arrays.toString(solve(image[0].length(), image.length, image, pattern[0].length(), pattern.length, pattern)));

    }

}
