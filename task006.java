/*	Plus Minus

	Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

	Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

	Input Format

	The first line contains an integer, , denoting the size of the array. 
	The second line contains  space-separated integers describing an array of numbers .

	Output Format

	You must print the following  lines:

	A decimal representing of the fraction of positive numbers in the array compared to its size.
	A decimal representing of the fraction of negative numbers in the array compared to its size.
	A decimal representing of the fraction of zeros in the array compared to its size.	*/
	
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int[] arr = Arrays.stream(str.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        double posCount = Arrays.stream(arr).filter(i -> i > 0).count();
        double negCount = Arrays.stream(arr).filter(i -> i < 0).count();
        double zeroCount = Arrays.stream(arr).filter(i -> i==0).count();
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(posCount / (double)N) + "\n"
                           + df.format(negCount / (double)N) + "\n"
                           + df.format(zeroCount / (double)N));
    }
}
