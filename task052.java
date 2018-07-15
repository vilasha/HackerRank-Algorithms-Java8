/*	Organizing Containers of Balls
	
	David has several containers, each with a number of balls in it. He has just enough containers to sort each type of ball he has into its own container. David wants to sort the balls using his sort method.

	As an example, David has  containers and  different types of balls, both of which are numbered from  to . The distribution of ball types per container are described by an  matrix of integers, . For example, consider the following diagram for :

	In a single operation, David can swap two balls located in different containers.

	David wants to perform some number of swap operations such that:

	Each container contains only balls of the same type.
	No two balls of the same type are located in different containers.
	You must perform  queries where each query is in the form of a matrix, . For each query, print Possible on a new line if David can satisfy the conditions above for the given matrix. Otherwise, print Impossible.

	Input Format

	The first line contains an integer , the number of queries.
	Each of the next  sets of lines is as follows:
	The first line contains an integer , the number of containers (rows) and ball types (columns).
	Each of the next  lines contains  space-separated integers describing row .

	Output Format

	For each query, print Possible on a new line if David can satisfy the conditions above for the given matrix. Otherwise, print Impossible.	*/
	
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Solution {
    
    private static int i;

    // if number of balls of any type in this container equals
    // to number of balls of this type in all the containers,
    // it is possible to sort out this container
    // we substract two lists to apply this rule to all the containers
    // if it is possible to organize containers, the result should be an empty list
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int q = sc.nextInt();
            while (q-- > 0) {
                int n = sc.nextInt(); sc.nextLine();
                int[][] M = new int[n][n];
                for (int i = 0; i < n; i++)
                    M[i] = Arrays.stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                List<Integer> containers = new LinkedList<>();
                List<Integer> balls = new LinkedList<>();
                int rowSum = 0, colSum = 0;
                for(i = 0; i < n; i++) {
                    // row sum
                    containers.add(Arrays.stream(M[i]).sum());
                    // column sum
                    balls.add(Arrays.stream(M).mapToInt(row -> row[i]).sum());
                }
                containers.removeAll(balls);
                System.out.println(containers.isEmpty() ? "Possible" : "Impossible");
            }
        }
	}
}