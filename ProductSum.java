/*
Product Sum _ 
Write a function that takes in a "special array and returns its product sum. 
A "special" array is a non-empty array that contains either integers or other "special" arrays. The product sum of a "special" array is the sum of its elements, where "special" arrays inside it are summed themselves and then multiplied by their level of depth. 
The depth of a "spec al array is how far nested it is. For Instance, the depth of LI is 1; the depth of the inner array in L L11 Is a the depth of the innermost array in tttttt is 0. 
Therefore, the product sum of Cx, y] x y ; the product sum of Lx , Cy, zil is x + 2 * (y + z) the product sum of to Ly , Lz111 is x + 2 (y + 32) . 
*/
import java.util.*;

class Program {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List < Object > array) {
        return productSumHelper(array, 1);
    }
    public static int productSumHelper(List < Object > array, int multiplier) {
        int total = 0;
        for (Object element: array) {
            if (element instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                ArrayList < Object > ls = (ArrayList < Object > ) element;
                total += productSumHelper(ls, multiplier + 1);
            } else {
                total += (int) element;
            }
        }
        return total * multiplier;
    }
}
