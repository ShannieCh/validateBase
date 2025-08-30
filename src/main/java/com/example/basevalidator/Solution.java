package com.example.basevalidator;

public class Solution {
    public static boolean validateBase(String num, int base) {
        if (num == null || num.isEmpty() || base < 2 || base > 36) {
            return false; // invalid input
        }

        num = num.toUpperCase();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int value;

            if (Character.isDigit(c)) {
                value = c - '0';
            } else if (Character.isLetter(c)) {
                value = c - 'A' + 10;
            } else {
                return false; // invalid character
            }

            if (value >= base) {
                return false; // character exceeds base
            }
        }
        return true; // all characters valid
    }
}
