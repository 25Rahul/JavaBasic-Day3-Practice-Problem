package com.bridgelabz.arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1, 9, 8};
        Arrays.sort(arr);
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
