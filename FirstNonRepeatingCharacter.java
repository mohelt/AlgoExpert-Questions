/*
First Non-Repeating Character • 
Write a function that takes in a string of lowercase English-alphabet letters and returns the index of the string's first non-repeating character. 
The first non-repeating character is the first character in a string that occurs only once. 
If the input string doesn't have any non-repeating characters, your function should return -1 . 
*/
import java.util.*;
class Program {

    public int firstNonRepeatingCharacter(String string) {

        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        char[] str = string.toCharArray();
        for (char c: str) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (map.get(str[i]) < 2) {
                return i;
            }
        }
        return -1;
    }
}