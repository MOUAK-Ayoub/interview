package com.codingame.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopDetection {


    public static int computeLastNode(int startNodeId, List<Integer> fromIds, List<Integer> toIds) {


        List<Integer> crossedNodes = new ArrayList<>();
        crossedNodes.add(Integer.valueOf(startNodeId));
        int indexOfNewStartId = fromIds.indexOf(startNodeId);
        while (indexOfNewStartId != -1 && !crossedNodes.contains(toIds.get(indexOfNewStartId))) {

            startNodeId=toIds.get(indexOfNewStartId);
            crossedNodes.add(Integer.valueOf(startNodeId));
            indexOfNewStartId = fromIds.indexOf(startNodeId);
        }
        return crossedNodes.get(crossedNodes.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> fromIds  = new ArrayList<>(Arrays.asList(1, 7, 3, 4, 2, 6, 9));
        List<Integer> toIds    = new ArrayList<>(Arrays.asList(3, 3, 4, 6, 6, 7, 5));
        int startNode= 7;
        System.out.println(computeLastNode(startNode,fromIds,toIds));

    }

}
