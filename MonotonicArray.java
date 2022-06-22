/*
Monotonic Array Write a functIon that takes in an array of 
integers and returns a boolean representing whether the array 
Is monotonic. An array is said to be monotonic if its elements, 
from left to right, are entirely non-increasing or entirely 
non-decreasing. Non-increasing elements aren't necessarily 
exclusively decreasing they simply don't increase. Similarly, 
non-decreasing elements aren't necessarily exclusively increasing; 
they simply don't decrease. Note that empty arrays and arrays of 
one element are monotonic. 
 */
 import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    boolean increasing = false;
    boolean decreasing =  false;

    for(int i =1; i<array.length;i++){
      if(array[i] < array[i-1]){
        decreasing = true;
      }
      if(array[i] > array[i-1]){
        increasing = true;
      }
    }

    return !decreasing || !increasing;
  }
}
