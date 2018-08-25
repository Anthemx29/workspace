package com.cparris.Sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr){

        int tempNum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length - 1); j++){
                if(arr[j-i] > arr[j]){
                    tempNum = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tempNum;
                }
            }
        }
    }
}
