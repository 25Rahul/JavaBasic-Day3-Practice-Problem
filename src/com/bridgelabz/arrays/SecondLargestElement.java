package com.bridgelabz.arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1, 9, 8};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
