package com.leetcode.warustamyan.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author William Arustamyan
 */

public class PalindromeNumber {


    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(323));
        System.out.println(isPalindrome(123));
    }

    private static boolean isNumberPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        final List<Integer> digits = new ArrayList<>();
        //get array of number digits
        while (number != 0) {
            digits.add(number % 10);
            number = number / 10;
        }

        for (int i = 0; i < digits.size() / 2; ++i) {
            if (digits.get(i) != digits.get((digits.size() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
    //best solution
    private static boolean isPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
