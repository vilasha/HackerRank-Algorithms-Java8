/*	Extra Long Factorials

	The factorial of the integer , written , is defined as:

	Calculate and print the factorial of a given integer.

	Note: Factorials of  can't be stored even in a  long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.

	We recommend solving this challenge using BigIntegers.

	Input Format

	Input consists of a single integer 

	Constraints


	Output Format

	Print the factorial of .	*/
	
import java.util.Scanner;
import java.math.BigInteger;

public class task040 {

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        System.out.println(result);
    }
}