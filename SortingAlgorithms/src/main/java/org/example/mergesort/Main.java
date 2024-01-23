package org.example.mergesort;

import static org.example.util.Printers.printArray;
import static org.example.util.RandomGen.getRandomIntegerArray;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        int[] temp = getRandomIntegerArray(10);

        System.out.println("Unsorted: " + printArray(temp));
        mergeSort.mergeSort(temp);
        System.out.println("Sorted: " + printArray(temp));
    }
}