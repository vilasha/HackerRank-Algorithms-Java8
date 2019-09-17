/*	Cut the sticks

	You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.

	Given the lengths of  sticks, print the number of sticks that are left before each iteration until there are none left.

	Note: Before each iteration you must determine the current shortest stick.

	Input Format 
	The first line contains a single integer . 
	The next line contains  space-separated integers: a0, a1,...an-1, where  represents the length of the  stick in array arr.

	Output Format 
	For each operation, print the number of sticks that are cut, on separate lines.	*/
	
import java.util.*;
import java.util.stream.Collectors;

public class task044 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); sc.nextLine();
            List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
            Set<Integer> set = new TreeSet<>(list);
            set.remove(Collections.max(set));
            System.out.println(n);
            int sum = 0;
            for (int i : set) {
                sum += Collections.frequency(list, i);
                System.out.println(n-sum);
            }
        }
    }
}