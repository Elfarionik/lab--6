package com.company;

public class task2 implements ISorter{
    //insertion
    public long[] sorter(long[] input) {
        ITester tester = new tester();
        tester.validatorNull(input);
        tester.validatorEmpty(input);


        long[] output = input.clone();

        for (int i = 0; i < output.length; i++) {
            long value = output[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                if (output[j] > value) {
                    output[j + 1] = output[j];
                    output[j] = value;
                } else break;

            }
        }
        return output;


    }
}
/*
10 2 10 3
10 10 10 3
2 10 10 3
2 10 3 10
2 3 10 10

 */