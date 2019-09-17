/*	Circular Array Rotation

	John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

	For each array, perform a number of right circular rotations and return the value of the element at a given index.

	For example, array ,  and . 
	First we perform the two rotations: 
	 
	Now return the values from indexes  and  as indicated in the  array. 
	 

	Input Format

	The first line contains  space-separated integers, , , and , the number of elements in the integer array, the rotation count and the number of queries. 
	The second line contains  space-separated integers, where each integer  describes array element  (where ). 
	Each of the  subsequent lines contains a single integer denoting , the index of the element to return from .

	Constraints

	Output Format

	For each query, print the value of the element at index  of the rotated array on a new line.	*/
	
import java.util.*;

public class task036 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), k = sc.nextInt(), q = sc.nextInt();
            k = k % n;
            sc.nextLine();
            int[] a = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            while (q-- > 0) {
                int m = sc.nextInt();
                System.out.println(a[(n + m - k) % n]);
            }
        }
    }
}