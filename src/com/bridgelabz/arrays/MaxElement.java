package com.bridgelabz.arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,9,8};
        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(largest < arr[i]){
                 largest = arr[i];
            }
        }
        System.out.println("Largest number in the array is:" + largest);

    }
}
