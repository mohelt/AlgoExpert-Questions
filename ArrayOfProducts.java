/*Array Of Products 
Write a function that takes in a non-empty array of integers and returns an array of the same length, where each element in the output array is equal to the product of every other number in the input array. 
In other words, the value at output [i] is equal to the product of every number in the input array other than input [i] . 
Note that you're expected to solve this problem without using division. 
*/

import java.util.*;
//more optimal solution using left and right arrays  holding the product of all elements to left and right of index;
class Program {
  public int[] arrayOfProducts(int[] array) {
    int[] arr=  new int[array.length]; 
    for(int i=0;i<array.length;i++){
      int total =1;
      for(int j=0;j<array.length;j++){
        if(i!=j) total=total*array[j];
    }
      arr[i] = total;
    }
    return arr;
  }
}