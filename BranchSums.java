/*
  Write a function that takes in a Binary Tree and returns a list of its branch
  sums ordered from leftmost branch sum to rightmost branch sum.
*/
import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> sums= new ArrayList<>();
     branchSumsRecursive(root, 0, sums);
    return sums;
  }
    public static void branchSumsRecursive(BinaryTree node,int runningSum,List<Integer> sums) {
    if (node==null) return;
      int newRunningSum= runningSum + node.value;
      if(node.left == null && node.right == null){
        sums.add(newRunningSum);
        return;
      }
      branchSumsRecursive(node.left,newRunningSum,sums);
      branchSumsRecursive(node.right,newRunningSum,sums);
  }
}
