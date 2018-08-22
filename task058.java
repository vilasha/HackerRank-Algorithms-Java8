/*	Halloween Sale

	You wish to buy video games from the famous online video game store Mist.

	Usually, all games are sold at the same price,  dollars. However, they are planning to have the seasonal Halloween Sale next month in which you can buy games at a cheaper price. Specifically, the first game you buy during the sale will be sold at dollars, but every subsequent game you buy will be sold at exactly  dollars less than the cost of the previous one you bought. This will continue until the cost becomes less than or equal to  dollars, after which every game you buy will cost  dollars each.

	For example, if ,  and , then the following are the costs of the first  games you buy, in order:

	You have  dollars in your Mist wallet. How many games can you buy during the Halloween Sale?

	Input Format

	The first and only line of input contains four space-separated integers p, d, m and s.

	Output Format

	Print a single line containing a single integer denoting the maximum number of games you can buy.	*/
	
import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int p, d, m, s;
        try (Scanner sc = new Scanner(System.in)) {
            int[] in = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
            p = in[0];
            d = in[1];
            m = in[2];
            s = in[3];
        }
        int numGames = 0;
        while (s >= 0) {
            s -= Math.max(m, p - d * numGames);
            numGames++;
        }
        if (numGames > 0)
            numGames--;
        System.out.println(numGames);
    }
}