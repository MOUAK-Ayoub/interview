package com.codingame.algorithms;

public class DigitChekcer {

    public static int digitCheck(String id) {
        int sum = 0;
        int sumOdd = 0;

        for (int i = 0; i < id.length(); i++) {
            if (i % 2 == 0) {
                sum += Character.getNumericValue(id.charAt(i));
            } else {
                sumOdd += Character.getNumericValue(id.charAt(i));

            }

        }
        sum = (sum * 3) + sumOdd;
        String sumString=String.valueOf(sum);
        int lastDigit = Character.getNumericValue(sumString.charAt(sumString.length() - 1));
        int idNew = lastDigit == 0 ? 0 : (10 - lastDigit);
        return idNew;
    }

    public static void main(String[] args) {
        System.out.println(digitCheck("39847"));
    }
}
