/*
Caesar Cipher Encryptor 'n• 
Given a non-empty string of lowercase letters and a non-negative integer representing a key, write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key. 
Note that letters should "wrap" around the alphabet; in other words, the letter z shifted by one returns the letter a . 
*/
import java.util.*;

class Program {
    public static String caesarCypherEncryptor(String str, int key) {

        char[] string = str.toCharArray();
        for (int i = 0; i < string.length; i++) {
            int y = string[i];
            while ((y + key) > 122) {
                y = y - 26;
            }
            char x = (char)(y + key);
            string[i] = x;
        }
        String stringFinal = new String(string);

        return stringFinal;
    }
}