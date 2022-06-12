/*
Write a function that takes in a non empty string and that returns
a bollean representing whether the string is a palindrome,
a palindrome is defined as a string that's written the same way forward
as backword. 
*/
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