package com.leetcode.warustamyan.easy;

/**
 * @author William Arustamyan
 */

public class SingleNumber {

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        int foundNumber = findSingleNumber(array);
        System.out.println(foundNumber);
    }

    public static int findSingleNumber(int[] array) {
        int number = 0;
        for (int i = 0; i < (array.length - 1) / 2; ++i) {
            number = number + array[i];
        }

        for (int i = (array.length - 1) / 2; i < array.length - 1; ++i) {
            number = number - array[i];
        }

        number = number + array[array.length - 1];
        return number;
    }
}
