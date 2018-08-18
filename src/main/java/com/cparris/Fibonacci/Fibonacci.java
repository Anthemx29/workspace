package com.cparris.Fibonacci;

public class Fibonacci {

    public Integer calculateFibonacci(int max){
        if(max <= 1){
            return max;
        }else{
            return calculateFibonacci(max - 1) + calculateFibonacci(max - 2);
        }
    }

}
