/*	Simple Array Sum

	Given an array of integers, find the sum of its elements.

	Input Format

	The first line contains an integer, , denoting the size of the array. 
	The second line contains  space-separated integers representing the array's elements.

	Output Format

	Print the sum of the array's elements as a single integer.	*/
	
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.nextLine();
        str = sc.nextLine();
        sc.close();
        int sum = Stream.of(str.split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList())
            .stream().mapToInt(Integer::intValue)
            .sum();
        System.out.println(sum);
    }
}