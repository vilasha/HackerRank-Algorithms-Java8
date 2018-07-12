/*	Append and Delete
	You have a string of lowercase English alphabetic letters. You can perform two types of operations on the string:

	Append a lowercase English alphabetic letter to the end of the string.
	Delete the last character in the string. Performing this operation on an empty string results in an empty string.
	Given an integer, , and two strings,  and , determine whether or not you can convert  to  by performing exactly  of the above operations on . If it's possible, print Yes. Otherwise, print No.

	For example, strings  and . Our number of moves, . To convert  to , we first delete all of the characters in  moves. Next we add each of the characters of  in order. On the  move, you will have the matching string. If there had been more moves available, they could have been eliminated by performing multiple deletions on an empty string. If there were fewer than  moves, we would not have succeeded in creating the new string.

	Input Format

	The first line contains a string , the initial string. 
	The second line contains a string , the desired final string. 
	The third line contains an integer , the number of operations.

	Constraints

	 and  consist of lowercase English alphabetic letters, .
	Output Format

	Print Yes if you can obtain string  by performing exactly  operations on . Otherwise, print No	*/
	
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            String t = sc.next();
            int k = sc.nextInt();
            int i = 0;
            while (i < s.length() && i < t.length() && s.charAt(i) == t.charAt(i))
                i++;
            System.out.println(
                (k >= s.length() + t.length() - 2 * i
                    && (k - s.length() + t.length() - 2 * i) % 2 == 0)
                ||  k >= s.length() + t.length()
                    ? "Yes" : "No");
        }
    }
}