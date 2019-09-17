/*	Modified Kaprekar Numbers

	A modified Kaprekar number is a positive whole number with a special property. If you square it, then split the number into two integers and sum those integers, you have the same value you started with.

	Consider a positive whole number  with  digits. We square  to arrive at a number that is either  digits long or digits long. Split the string representation of the square into two parts,  and . The right hand part,  must be  digits long. The left is the remaining substring. Convert those two substrings back to integers, add them and see if you get .
	For example, if ,  then . We split that into two strings and convert them back to integers  and . We test , so this is not a modified Kaprekar number. If , still , and . This gives us , the original .
	Note: r may have leading zeros.
	Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!):
	In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.

	The Task 
	You are given the two positive integers  and  where  is lower than . Write a program to print the modified Kaprekar numbers in the range between  and , inclusive.

	Input Format

	The first line contains the lower integer limit  . The second line contains the upper integer limit .
	Note: Your range should be inclusive of the limits.

	Output Format

	Output each modified Kaprekar number in the given range, space-separated on a single line. If no modified Kaprekar numbers exist in the given range, print INVALID RANGE.	*/
	
import java.util.Scanner;

public class task055 {

    public static void main(String[] args) {
        long p, q;
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(System.in)) {
            p = sc.nextLong();
            q = sc.nextLong();
        }
        if (p <= 1)
            sb.append("1 ");
        long square, log10;
        for (long i = p; i <= q; i++) {
            square = i * i;
            log10 = 1;
            while (i > log10)
                log10 *= 10;
            if (square % log10 > 0
                    && square / log10 + square % log10 == i)
                sb.append(i + " ");
        }
        System.out.println(sb.length() == 0 ? "INVALID RANGE" : sb.toString());
    }
}