/*	Picking Numbers

	Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to . For example, if your array is , you can create two subarrays meeting the criterion:  and . The maximum length subarray has  elements.

	Input Format

	The first line contains a single integer , the size of the array . 
	The second line contains  space-separated integers .

	Constraints

	The answer will be .
	Output Format

	A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference between any two of the chosen integers is .	*/
	
import java.util.*;
import java.util.stream.Collectors;

public class task027 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
            int[] a = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            List<Integer> aList = Arrays.stream(a)
                    .boxed()
                    .collect(Collectors.toList());
            Set<Integer> aSet = new HashSet<>(aList);
            int result = 0;
            for (int i : aSet)
                result = Math.max(result, 
                                  Collections.frequency(aList, i)
                                  + Collections.frequency(aList, i+1));
            System.out.println(result);
        }
    }
}