/*
Write a function that takes in an array of integers and returns
a sorted version of that array. Use the Selection Sort algorithm 
to sort the array.
*/
import java.util.*;

class Program {
    public static int[] selectionSort(int[] array) {
        if (array.length == 0) {
            return new int[] {};
        }
        int start = 0;
        while (start < array.length - 1) {
            int index = start;
            for (int i = start + 1; i < array.length; i++) {
                if (array[index] > array[i]) {
                    index = i;
                }
            }
            swap(array, start, index);
            start++;
        }

        return array;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }