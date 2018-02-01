package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegerArray = getIntegers(5);
        printArray(sortArray(myIntegerArray));
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values: \r");
        int[] array = new int[capacity];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value = " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];

        int temp;
        boolean keepGoing = true;

        while (keepGoing) {
            keepGoing = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    keepGoing = true;
                }
            }
        }

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[i];
        }

        return sortedArray;
    }
















}
