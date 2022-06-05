import java.util.*;
import java.util.Arrays;   
/* 
  Write a function that takes in a non-empty array of integers that are sorted
  in ascending order and returns a new array of the same length with the squares
  of the original integers also sorted in ascending order.
*/
//useful functions etc
//import java.util.Arrays;   
//Math.abs(array[start])
class Program {

  public int[] sortedSquaredArray(int[] array) {
    int[] arrayNew = new int[array.length];
    for(int i=0;i<array.length;i++){
      arrayNew[i]=array[i]*array[i];
    }
    Arrays.sort(arrayNew);
    return arrayNew;
  }
}
class Program {
    public int[] sortedSquaredArray(int[] array) {
        int[] arrayNew = new int[array.length];
        int start = 0;
        int end = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--)
            if (Math.abs(array[start]) > Math.abs(array[end])) {
                arrayNew[i] = array[start] * array[start];
                start++;
            } else {
                arrayNew[i] = array[end] * array[end];
                end--;
            }
        return arrayNew;
    }
}

