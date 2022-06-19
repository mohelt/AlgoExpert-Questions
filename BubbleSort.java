/*
Write a function that takes in an array of integers and returns
a sorted version of that array. Use the Bubble Sort algorithm 
to sort the array.

*/
import java.util.*;

class Program {
    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1, counter);
                    isSorted = false;
                }
            }
            counter++;
        }

        return array;
    }
 
}