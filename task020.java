/*	Bon Appétit

	Anna and Brian are sharing a meal at a restuarant and they agree to split the bill equally. Brian wants to order something that Anna is allergic to though, and they agree that Anna won't pay for that item. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

	For example, assume the bill has the following prices: . Anna declines to eat item  which costs . If Brian calculates the bill correctly, Anna will pay . If he includes the cost of , he will calculate . In the second case, he should refund  to Anna.

	You are given an array of prices, , the cost of each of the  items, , the item Anna doesn't eat, and , the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print Bon Appetit. Otherwise, print the integer amount of money that Brian must refund to Anna.

	Input Format

	The first line contains two space-separated integers  and , the number of items ordered and the -based index of the item that Anna did not eat. 
	The second line contains  space-separated integers  where . 
	The third line contains an integer, , the amount of money that Brian charged Anna for her share of the bill.

	Constraints

	Output Format

	If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e., ) that Brian must refund to Anna. This will always be an integer.	*/
	
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        int[] bill = Arrays.stream(sc.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        int charged = sc.nextInt();
        sc.close();
        int actual = (Arrays.stream(bill).sum() - bill[K]) / 2;
        System.out.println((actual == charged) ? "Bon Appetit" : charged - actual);
    }
}