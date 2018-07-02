/*	A Very Big Sum

	Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

	Input Format

	The first line of the input consists of an integer . 
	The next line contains  space-separated integers contained in the array.

	Output Format

	Print the integer sum of the elements in the array.	*/
	
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.nextLine();
        str = sc.nextLine();
        sc.close();
        long sum = Stream.of(str.split(" "))
            .map(Long::parseLong)
            .collect(Collectors.toList())
            .stream().mapToLong(Long::longValue)
            .sum();
        System.out.println(sum);
    }
}
