package com.javapractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 2, 5, 1, 6, 3, 7};
// Using HashSet
        Set<Integer> uniqueSet = new HashSet<>(Arrays.asList(numbers));
        Integer[] uniqueNumbers = uniqueSet.toArray(new Integer[0]);
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Without duplicates: " + Arrays.toString(uniqueNumbers));
    }
}
