/*
Generate Document •• 
You're given a string of available characters and a string representing a document that you need to generate. Write a function that determines if you can generate the document using the available characters. If you can generate the document, your function should return true ; otherwise, it should return false . 
You're only able to generate the document if the frequency of unique characters in the characters string is greater than or equal to the frequency of unique characters in the document string. For example, if you're given characters = "abcabc" and document = "aabbccc" you cannot generate the document because you're missing one c . 
The document that you need to create may contain any characters, including special characters, capital letters, numbers, and spaces. 
Note: you can always generate the empty string ( "" ). 
*/
import java.util.*;

class Program {

    public boolean generateDocument(String characters, String document) {
        HashMap < Character, Integer > map1 = new HashMap < Character, Integer > ();
        HashMap < Character, Integer > map2 = new HashMap < Character, Integer > ();
        for (char c: characters.toCharArray()) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (char x: document.toCharArray()) {
            if (map2.containsKey(x)) {
                map2.put(x, map2.get(x) + 1);
            } else {
                map2.put(x, 1);
            }
        }
        for (int i = 0; i < document.toCharArray().length; i++) {
            if (!map1.containsKey(document.toCharArray()[i])) {
                return false;
            } else {
                if (map1.get(document.toCharArray()[i]) < map2.get(document.toCharArray()[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}