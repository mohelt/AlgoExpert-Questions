/*
Run-Length Encoding •ii• 
Write a lunct . that takes in a non-empty string and returns its 
run-length encoding. 
From Wikipedia, "run-length encoding is a form of lossless 
data compression in which runs of data are stored as a single
data value and count, rather than as the anginal run." For this
problem, a run of data is any sequence of consecutive, 
identical characters. So the run "AAA" would be run-length-encoded 
as ".3A" To make thIngs more complicated, however, the input string 
can contain all sorts of spec al characters, including numbers. And 
sInce encoded data must be decodable, this means that we can't naively
 run-length-encode long runs. For example, the run "AAAAAAAAAAAA" 
(12 A s), can't naively be encoded as "000" , sInce this string can 
be decoded as either "AAAAAAAAAAAA" or "CAA" . Thus, long runs (runs 
of 10 or more characters) should be encoded in a split fashion; the 
aforementioned run should be encoded as "sus/1" . 
 */
import java.util.*;

class Program {
    public String runLengthEncoding(String string) {
        StringBuilder encodeChar = new StringBuilder();
        int currentRunLength = 1;
        char[] charArray = string.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            char curChar = charArray[i];
            char preChar = charArray[i - 1];

            if ((curChar != preChar) || (currentRunLength == 9)) {
                encodeChar.append(Integer.toString(currentRunLength));
                encodeChar.append(preChar);
                currentRunLength = 0;
            }
            currentRunLength += 1;
        }
        encodeChar.append(Integer.toString(currentRunLength));
        encodeChar.append(charArray[string.length() - 1]);

        return encodeChar.toString();
    }
}