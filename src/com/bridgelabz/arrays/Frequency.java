package com.bridgelabz.arrays;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
          int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 8, 1, 2, 4, 3, 5, 1};
          Map<Integer,Integer> frequencyMap = new HashMap<>();
          for(int element : arr){
              if(frequencyMap.containsKey(element)){
                  frequencyMap.put(element,frequencyMap.get(element)+1);
              }
              else{
                  frequencyMap.put(element,1);
              }
          }

          System.out.println("Element : Frequency");
          for(Map.Entry<Integer , Integer> entry : frequencyMap.entrySet()){
              System.out.println(entry.getKey()+" : "+entry.getValue());

          }

    }
}
