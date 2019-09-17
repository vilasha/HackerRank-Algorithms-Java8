/*	Non-Divisible Subset

	Given a set of distinct integers, print the size of a maximal subset of  where the sum of any  numbers in  is not evenly divisible by .

	Input Format

	The first line contains  space-separated integers,  and , the number of values in  and the non factor. 
	The second line contains  space-separated integers describing , the unique values of the set.

	All of the given numbers are distinct.
	Output Format

	Print the size of the largest possible subset ().	*/
	
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Collections;

public class task045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        List<Integer> modulo = Arrays.stream(sc.nextLine().split(" "))
            .map(Integer::parseInt)
            .map(i -> i = i % k)
            .collect(Collectors.toList());
        sc.close();
        int maxSubLength = 0;
        int limit = (int)Math.round((double)k / 2);
        for (int i = 1; i < limit; i++)
            maxSubLength += Math.max(
                Collections.frequency(modulo, i),
                Collections.frequency(modulo, k-i));
        maxSubLength += (modulo.contains(0)) ? 1 : 0;
        maxSubLength += (k % 2 == 0 && modulo.contains(k/2)) ? 1 : 0;
        maxSubLength = (k==1) ? 1 : maxSubLength;
        System.out.println(maxSubLength);
    }
}