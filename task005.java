/*	Diagonal Difference

	Given a square matrix, calculate the absolute difference between the sums of its diagonals.

	For example, the square matrix  is shown below:

	1 2 3
	4 5 6
	9 8 9  
	The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

	Function description

	Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.

	diagonalDifference takes the following parameter:

	arr: an array of integers .
	Input Format

	The first line contains a single integer, , the number of rows and columns in the matrix . 
	Each of the next  lines describes a row, , and consists of  space-separated integers .

	Constraints

	Output Format

	Print the absolute difference between the sums of the matrix's two diagonals as a single integer.	*/
	
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[][] array = new int[N][];
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            array[i] = Arrays.stream(str.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        }
        sc.close();
        int result = 0;
        for (int i = 0; i < N; i++)
            result += array[i][i] - array[i][N-i-1];
        result = Math.abs(result);
        System.out.println(result);
    }
}
