/*	Staircase

	Consider a staircase of size n=4:

	   #
	  ##
	 ###
	####
	Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

	Write a program that prints a staircase of size .

	Input Format

	A single integer, , denoting the size of the staircase.

	Output Format

	Print a staircase of size  using # symbols and spaces.

	Note: The last line must have  spaces in it.	*/
	
import java.util.*;

public class Solution {

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                if (j > i + 1)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }                
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        staircase(n);
        scanner.close();
    }
}