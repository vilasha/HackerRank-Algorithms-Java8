/*	Mini-Max Sum

	Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

	Input Format

	A single line of five space-separated integers.

	Constraints

	Each integer is in the inclusive range .
	Output Format

	Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)	*/
	
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) throws NoSuchElementException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        List<Integer> array = Stream.of(str.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        long minNum = array.stream().mapToLong(v->v).min().getAsLong();
        long maxNum = array.stream().mapToLong(v->v).max().getAsLong();
        long sum = array.stream().mapToLong(v->v).sum();
        System.out.println((sum - maxNum) + " " + (sum - minNum));
    }
}
