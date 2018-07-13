/*	Equalize the Array

	Karl has an array of integers. He wants to reduce the array until all remaining elements are equal. Determine the fewest number of elements to delete to reach his goal.

	For example, if his array is , we see that he can delete the  elements  and  leaving . He could also delete both twos and either the  or the , but that would take  deletions. The minimum number of deletions is .

	Input Format

	The first line contains an integer , the number of elements in . 
	The next line contains  space-separated integers .

	Output Format

	Print a single integer denoting the minimum number of elements Karl must delete for all elements in the array to be equal.	*/
	
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    
    static int max = 0;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.nextLine();
            List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
            Set<Integer> set = new HashSet<>(list);
            set.forEach(i -> max = Math.max(max, Collections.frequency(list, i)));
            System.out.println(list.size() - max);
        }
    }
}