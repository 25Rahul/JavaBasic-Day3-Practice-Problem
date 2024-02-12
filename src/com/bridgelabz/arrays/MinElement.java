package com.bridgelabz.arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,9,8};
        int smallest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number in the array is:" + smallest);

    }
}
