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

        System.out.println(setOfMatchingNumbers);

    }

    public static char findFirstNonRepeatingCharacterInString(String string){

        HashMap<Character, Integer> counts = new LinkedHashMap<>();

        for(int i = 0; i < string.length() - 1; i++){
            if(counts.containsKey(string.charAt(i))){
                int count = counts.get(string.charAt(i)) + 1;
                counts.put(string.charAt(i), count);
            }else{
                counts.put(string.charAt(i), 1);
            }
        }

        int count = 0;

        for(Map.Entry<Character, Integer> entry : counts.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        throw new RuntimeException("No Value Found");

    }
}
