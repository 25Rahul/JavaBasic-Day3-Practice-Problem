package com.bridgelabz.arrays;

public class OddIndexElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1, 9, 8};
        for(int i =0;i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
