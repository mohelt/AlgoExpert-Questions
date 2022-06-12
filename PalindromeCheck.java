import java.util.*;

class Program {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] string = str.toCharArray();
        while (right > left) {
            if (string[left] == string[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}