package com.codingame.algorithms;

public class TestChange {
    public static void main(String[] args) {
        Change change = Change.getChangeFromAmount(10);
        System.out.println(change.toString());
        Change change2 = Change.getChangeFromAmount(23);
        System.out.println(change2.toString());
        Change change3 = Change.getChangeFromAmount(11);
        System.out.println(change3.toString());
        Change change4 = Change.getChangeFromAmount(60);
        System.out.println(change4.toString());
        Change change5 = Change.getChangeFromAmount(82);
        System.out.println(change5.toString());
    }
}
