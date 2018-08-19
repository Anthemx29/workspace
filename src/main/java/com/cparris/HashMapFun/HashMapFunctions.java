package com.cparris.HashMapFun;

import java.util.*;

public class HashMapFunctions {

    public static void findTwoNumbersThatSumToGivenValue_BigO_N(List<Integer> listOfNumbers, Integer sum){

       HashSet<Integer> hashSet = new HashSet<>();

        //O(n) Insert
        for(int i = 0; i < listOfNumbers.size(); i++){
            hashSet.add(listOfNumbers.get(i));
        }

        Set<Integer> setOfMatchingNumbers = new HashSet<>();

        //O(n) Search
        for(Integer value : listOfNumbers) {
            Integer targetNumber = sum - value;
            if (!hashSet.contains(targetNumber)) {
                //do nothing
            } else {
                System.out.printf("(%d,%d) %n", value, targetNumber);
            }

        }


    }
}
