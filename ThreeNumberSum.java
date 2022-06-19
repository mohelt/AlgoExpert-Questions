/* 
Three Number Sum _ 
Write a function that takes in a non-empty 
array of distinct integers and an integer 
representing a target sum. The function 
should find all triplets in the array that 
sum up to the target sum and return a 
two-dimensional array of all these triplets. 
The numbers in each triplet should be ordered 
in ascending order, and the triplets 
themselves should be ordered in ascending 
order with respect to the numbers they hold. 
If no three numbers sum up to the target sum, 
the function should return an empty array. 
*/
import java.util.*;

class Program {
    public static List < Integer[] > threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        ArrayList < Integer[] > list = new ArrayList < Integer[] > ();
        for (int i = 0; i < array.length - 2; i++) {
            int leftpointer = i + 1;
            int rightpointer = array.length - 1;
            while (leftpointer < rightpointer) {
                int currentSum = array[i] + array[leftpointer] + array[rightpointer];
                if (currentSum == targetSum) {
                    Integer[] triplet = {
                        array[i],
                        array[leftpointer],
                        array[rightpointer]
                    };
                    list.add(triplet);
                    rightpointer--;
                    leftpointer++;
                } else if (currentSum < targetSum) {
                    leftpointer++;
                } else if (currentSum > targetSum) {
                    rightpointer--;
                }
            }
        }
        return list;
    }
}