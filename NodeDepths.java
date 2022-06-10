import java.util.*;

class Program {
  
  public static int nodeDepths(BinaryTree root) {
    return nodeDepthsa(0,root); 
  }
      public static int nodeDepthsa(int sum,BinaryTree root) {
      if(root == null){
        return 0;
      }
       return sum + nodeDepthsa(sum+1,root.right) + nodeDepthsa(sum+1,root.left);
  }
  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
   
    }
  }