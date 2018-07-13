/*	Repeated String
	
	Lilah has a string, , of lowercase English letters that she repeated infinitely many times.

	Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

	For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.

	Input Format

	The first line contains a single string, . 
	The second line contains an integer, .

	Output Format

	Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.	*/
	
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();                                   // word
            long n = sc.nextLong();
            long sLen = s.length();                                 // word total length
            long aCount = s.length() - s.replace("a", "").length(); // occurences of "a" in word
            long mod = n % sLen;  // how many times the whole word go into resulting string
            String substr = s.substring(0, (int)mod);   // leftover part which will be at the end
                                                        // of resulting string
            long aCountAdd = mod - substr.replace("a", "").length(); // occurences of "a" 
                                                                     // in leftover part
            System.out.println(aCount * (n / sLen) + aCountAdd);
        }
    }
}