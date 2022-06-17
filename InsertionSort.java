/*
Write a function that takes in an array of integers and returns
a sorted version of that array. Use the Insertion Sort algorithm 
to sort the array.
*/
import java.util.*;

class Program {
    public static int[] insertionSort(int[] array) {
        // Write your code here.
        if (array.length == 0) {
            return new int[] {};
        }
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                j -= 1;
            }
        }
        return array;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}