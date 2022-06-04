import java.util.*;

  /*Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. If any two numbers in the input array sum
  up to the target sum, the function should return them in an array, in any
  order. If no two numbers sum up to the target sum, the function should return
  an empty array.
  Note that the target sum has to be obtained by summing two different integers
  in the array; you can't add a single integer to itself in order to obtain the
  target sum.
  You can assume that there will be at most one pair of numbers summing up to
  the target sum.*/

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    //o(n)time, o(n) space
    int[] finalArray = new int[2];
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array.length;j++){
      if((targetSum-array[i]) == array[j] && (i!=j) ){
        finalArray[0]=array[i];
        finalArray[1]=array[j];
      }
    }
    }
    if(finalArray[0]==0 && finalArray[1]==0){
      return new int[0];
      }
    return finalArray;
  }
}

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> nums = new HashSet<>();
    for(int num : array) {
      int potentialMatch = targetSum - num;
      if(nums.contains(potentialMatch)){
        return new int[] {potentialMatch, num};
        } else {
        nums.add(num);
        }
      }
    return new int[0];
  }
}

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    //O(nlog(n)), o(1) space
    Arrays.sort(array);
    int left =0;
    int right = array.length -1;
    while(left < right) {
      int currentSum = array[left] + array[right];
      if(currentSum == targetSum) {
        return new int[] {array[left], array[right]};
        } else if (currentSum < targetSum){
        left++;
        } else if (currentSum > targetSum) {
        right--;
        }
      }
    return new int[0];
    }
}