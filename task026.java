/*	Forming a Magic Square

	We define a magic square to be an  matrix of distinct positive integers from  to  where the sum of any row, column, or diagonal of length  is always equal to the same number: the magic constant.

	You will be given a  matrix  of integers in the inclusive range . We can convert any digit  to any other digit  in the range  at cost of . Given , convert it into a magic square at minimal cost. Print this cost on a new line.

	Note: The resulting magic square must contain distinct integers in the inclusive range .

	For example, we start with the following matrix :

	5 3 4
	1 5 8
	6 4 2
	We can convert it to the following magic square:

	8 3 4
	1 5 9
	6 7 2
	This took three replacements at a cost of .

	Input Format

	Each of the lines contains three space-separated integers of row .

	Constraints

	Output Format

	Print an integer denoting the minimum cost of turning matrix  into a magic square.	*/
	
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++)
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        scanner.close();
        int[][][] magicDictionary = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };
        int minCost = Integer.MAX_VALUE;
        int currentCost;
        for (int i = 0; i < 8; i++) {
            currentCost = 0;
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    currentCost += Math.abs(matrix[j][k] - magicDictionary[i][j][k]);
            minCost = Math.min(minCost, currentCost);
        }
        System.out.println(minCost);
    }
}