/*	Minimum Distances

	We define the distance between two array values as the number of indices between the two values. Given , find the minimum distance between any pair of equal elements in the array. If no such value exists, print .

	For example, if , there are two matching pairs of values: . The indices of the 's are  and , so their distance is . The indices of the 's are  and , so their distance is .

	Input Format

	The first line contains an integer , the size of array . 
	The second line contains  space-separated integers .

	Output Format

	Print a single integer denoting the minimum  in . If no such value exists, print -1.	*/
	
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.nextLine();
            int[] a = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
            int n = a.length;
            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++)
                for (int j = 0; j < i; j++)
                    if (a[i] == a[j] && i - j < minDistance)
                        minDistance = i - j;
            if (minDistance == Integer.MAX_VALUE)
                minDistance = -1;
            System.out.println(minDistance);
        }
    }
}