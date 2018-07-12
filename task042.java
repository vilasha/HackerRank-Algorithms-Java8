/*	Sherlock and Squares

	Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value describing a range of integers. Sherlock must determine the number of square integers within that range, inclusive of the endpoints.

	Note: A square integer is an integer which is the square of an integer, e.g. .

	Input Format

	The first line contains , the number of test cases. 
	Each of the next  lines contains two space-separated integers denoting  and , the starting and ending integers in the ranges.

	Output Format

	For each test case, print the number of square integers in the range on a new line.	*/
	
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while (T-- > 0)
                System.out.println(
                    1 - (int)Math.ceil(Math.sqrt(sc.nextInt()))
                    + (int)Math.floor(Math.sqrt(sc.nextInt()))
                    );
        }
    }
}