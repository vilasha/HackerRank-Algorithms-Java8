/*	Divisible Sum Pairs

	You are given an array of  integers, , and a positive integer, . Find and print the number of  pairs where  and  +  is divisible by .

	Input Format

	The first line contains  space-separated integers,  and . 
	The second line contains  space-separated integers describing the values of .

	Constraints

	Output Format

	Print the number of  pairs where  and  +  is evenly divisible by .	*/
	
import java.util.*;

public class task017 {
    static int divisibleSumPairs(int n, int k, int[] A) {
        int result = 0;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                result += (A[i] + A[j]) % k == 0 ? 1 : 0;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int[] A = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        scanner.close();
        System.out.println(divisibleSumPairs(n, k, A));
    }
}