/*	Find Digits

	An integer  is a divisor of an integer  if the remainder of .

	Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

	Note: Each digit is considered to be unique, so each occurrence of the same digit should be counted (e.g. for ,  is a divisor of  each time it occurs so the answer is ).

	Input Format

	The first line is an integer, , indicating the number of test cases. 
	The  subsequent lines each contain an integer, .

	Output Format

	For every test case, count the number of digits in  that are divisors of . Print each answer on a new line.	*/
	
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                String nString = String.valueOf(n);
                System.out.println(nString.chars()
                    .filter(i -> i > 48 && n % (i-48) == 0)
                    .count() );
            }
        }
    }
}