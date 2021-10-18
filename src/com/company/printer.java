package com.company;

public class printer implements IPreinter {
    public void printResults(long[] input) {

        for (long el : input) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

}
