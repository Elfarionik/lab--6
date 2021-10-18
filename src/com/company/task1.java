package com.company;


public class task1 implements ISorter {
    //selection

    public long[] sorter(long[] input) {
        ITester tester = new tester();
        tester.validatorNull(input);
        tester.validatorEmpty(input);


        long[] output = input.clone();

        for (int min = 0; min < output.length - 1; min++) {
            int least = min;

            for (int i = min + 1; i < output.length; i++) {
                if (output[least] > output[i])
                    least = i;
            }
            long temp = output[min];
            output[min] = output[least];
            output[least] = temp;

        }
        return output;


    }
}
/*
10 2 10 3

 */