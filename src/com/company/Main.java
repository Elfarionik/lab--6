package com.company;

public class Main {
    public static void main(String[] args) {

        long[][] arrOfARrr = new long[][]{ new long[]{}, null,  new long[]{64, 64, 39, 32, 32, 12, 15, 32}};

        IPreinter print = new printer();
        ISorter ex1 = new task1();

        for (long[] array : arrOfARrr) {
            try {
                System.out.println("\n\nThis is sort of task 1");
                print.printResults(ex1.sorter(array));
            } catch (NullPointerException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        ISorter ex2 = new task2();
        for (long[] array : arrOfARrr) {
            try {
                System.out.println("\n\nThis is sort of task 2");
                print.printResults(ex2.sorter(array));
            } catch (NullPointerException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
