package com.codingame.algorithms;

public class Change {

    private long bills2;
    private long bills5;
    private long bills10;

    public Change(long bills2, long bills5, long bills10) {
        this.bills2 = bills2;
        this.bills5 = bills5;
        this.bills10 = bills10;
    }

    public static Change getChangeFromAmount(long s) {

        if(s == 1 || s ==3){
            return null;
        }

        long bills10 = s / 10;
         s = s % 10;

        if (s == 1 || s == 3) {
            long bills2 = ((s + 10) - 5) / 2;
            return new Change(bills2, 1, bills10 - 1);
        }

        if (s % 2 == 0) {
            long bills2 = s / 2;
            return new Change(bills2, 0, bills10);
        } else {
            long bills2 = (s - 5) / 2;
            return new Change(bills2, 1, bills10 );
        }

    }

    public long getBills2() {
        return bills2;
    }


    public long getBills5() {
        return bills5;
    }


    public long getBills10() {
        return bills10;
    }

    @Override
    public String toString() {
        return "Change{" +
                "bills2=" + bills2 +
                ", bills5=" + bills5 +
                ", bills10=" + bills10 +
                '}';
    }
}
