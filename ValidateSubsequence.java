import java.util.*;
/*
  Given two non-empty arrays of integers, write a function that determines
  whether the second array is a subsequence of the first one.

  A subsequence of an array is a set of numbers that aren't necessarily adjacent
  in the array but that are in the same order as they appear in the array. For
  instance.

  Note that a single number in an array and the array itself are both valid subsequences of the array.

    */

//useful functions for list
//array.remove(int index)
//array size instead of length
// Declare a list = List<Integer> finalArray = new ArrayList<>();
class Program {
    public static boolean isValidSubsequence(List < Integer > array, List < Integer > sequence) {
        List < Integer > finalArray = new ArrayList < > ();
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < sequence.size(); j++) {
                if (finalArray.size() < sequence.size()) {
                    if (array.get(i) == sequence.get(j)) {
                        finalArray.add(array.get(i));
                        if (i < (array.size() - 1)) {
                            i++;
                        }
                    }
                }

            }
        }
        if (sequence.size() > array.size()) {
            return false;
        } else {
            return finalArray.equals(sequence);
        }
    }
}