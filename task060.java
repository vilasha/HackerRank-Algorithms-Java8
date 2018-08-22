/*	Chocolate Feast

	Little Bobby loves chocolate. He frequently goes to his favorite  store, Penny Auntie, to buy them. They are having a promotion at Penny Auntie. If Bobby saves enough wrappers, he can turn them in for a free chocolate.

	Complete the chocolateFeast function in the code stub below to return the number of chocolates Bobby can eat with a given amount of money after taking full advantage of the promotion.

	Note: Little Bobby will always turn in his wrappers if he has enough to get a free chocolate.

	Input Format

	The first line contains an integer, , denoting the number of scenarios to analyze. 
	Each of the next  lines contains three space-separated integers: , , and . They represent money to spend, cost of a chocolate, and the number of wrappers he can turn in for a free chocolate.

	Output Format

	For each trip to Penny Auntie, print the total number of chocolates Bobby eats on a new line.	*/

import java.util.Scanner;

public class Solution {
    
    private static int chocolateFeast(int n, int c, int m) {
        int result = n / c;
        int wrappers = result;
        while (wrappers >= m) {
            result += wrappers / m;
            wrappers = wrappers / m + wrappers % m;
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt(); sc.nextLine();
            while (t-- > 0) {
                String[] ncm = sc.nextLine().split(" ");
                int n = Integer.parseInt(ncm[0]);
                int c = Integer.parseInt(ncm[1]);
                int m = Integer.parseInt(ncm[2]);
                System.out.println(chocolateFeast(n, c, m));
            }
        }
    }
}
