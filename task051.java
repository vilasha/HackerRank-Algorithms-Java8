/*	Taum and B'day

	Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has to buy  black gifts and  white gifts.

	The cost of each black gift is  units.
	The cost of every white gift is  units.
	The cost of converting each black gift into white gift or vice versa is  units.
	Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.

	Input Format

	The first line will contain an integer , the number of test cases. 
	The next  pairs of lines are as follows: - The first line contains the values of integers  and . - The next line contains the values of integers , , and .

	Output Format

	t lines, each containing an integer: the minimum amount of units Taum needs to spend on gifts.	*/
	 
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            long b, w, bc, wc, z;
            while (t-- > 0) {
                b = sc.nextLong(); w = sc.nextLong();
                bc = sc.nextLong(); wc = sc.nextLong();
                z = sc.nextLong();
                bc = Math.min(bc, wc + z);
                wc = Math.min(wc, bc + z);
                System.out.println(b * bc + w * wc);
            }
        }
    }
}