package com.codingame.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Node {

    int value;
    Node left;
    Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node findOutOfMemoryError(int v) {
        if (this.value == v) {
            return this;
        }
        if (v < value && left != null) {

            return this.left.find(v);

        }

        if (v > value && right != null) {

            return right.find(v);

        }
        return null;
    }

    public Node find(int v) {
        Node racine = this;
        while (racine != null) {
            if (racine.value == v) {
                return racine;
            }
            racine = v < racine.value ? racine.left : racine.right;

        }
        return null;
    }

    public static void main(String[] args) {

        Node six = new Node(6,null, null );
        Node two= new Node(2,null,null);
        Node five=new Node(5,two,six);
        Node eight = new Node(8,null,null);

        Node seven = new Node(7,five,eight);

        Node node1 = seven.find(7);

        Node nodex = seven.find(6);
        Node nodey = seven.find(100);
        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        List<String> collect0 = alpha.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());

        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());

    }
}
