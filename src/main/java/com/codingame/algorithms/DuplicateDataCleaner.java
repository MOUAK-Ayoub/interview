package com.codingame.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateDataCleaner {

    public static int[] cleanData(int[] data) {
        Set<Integer> set = Arrays.stream(data).boxed().collect(Collectors.toSet());
        int[] newData = set.stream().mapToInt(Integer::intValue).toArray();
        return newData;

    }

    public static void main(String[] args) {
        int[] returnData = cleanData(new int[]{});
        System.out.println(returnData);

    }
}
