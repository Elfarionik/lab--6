package com.company;

public class tester implements ITester {

    public  void validatorNull(long[] input){
        if(input == null){
            throw new NullPointerException("Why would you put null here?");
        }
    }

    public  void validatorEmpty(long[] input){
        if(input.length == 0){
            throw new IllegalArgumentException("Why would  you put empty array here?");
        }
    }
}
