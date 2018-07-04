/*	Apple and Orange

	Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the red region denotes his house, where  is the start point, and  is the endpoint. The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees are located on a single point, where the apple tree is at point , and the orange tree is at point .

	Apple and orange(2).png

	When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. A negative value of  means the fruit fell  units to the tree's left, and a positive value of  means it falls  units to the tree's right.

	Complete the function countApplesAndOranges,

	where,

	 Starting point of Sam's house location. 
	 Ending location of Sam's house location. 
	 Location of the Apple tree. 
	 Location of the Orange tree. 
	 Number of apples that fell from the tree. 
	 Distance at which each apple falls from the tree. 
	 Number of oranges that fell from the tree. 
	 Distance at which each orange falls from the tree.

	Given the value of  for  apples and  oranges, can you determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range )? Print the number of apples that fall on Sam's house as your first line of output, then print the number of oranges that fall on Sam's house as your second line of output.

	Input Format

	The first line contains two space-separated integers denoting the respective values of  and . 
	The second line contains two space-separated integers denoting the respective values of  and . 
	The third line contains two space-separated integers denoting the respective values of  and . 
	The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point . 
	The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .

	Constraints

	Output Format

	Print two integers on two different lines:

	The first integer: the number of apples that fall on Sam's house.
	The second integer: the number of oranges that fall on Sam's house.	*/
	
import java.util.*;
import java.util.stream.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        long countApples = Arrays.stream(apples).filter(d -> a+d >= s && a+d <= t).count();
        long countOranges = Arrays.stream(oranges).filter(d -> b+d >=s && b+d <= t).count();
        System.out.println(countApples + "\n" + countOranges);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);
        String[] ab = scanner.nextLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
        int[] apples = new int[m];
        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }
        int[] oranges = new int[n];
        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
        scanner.close();
    }
}