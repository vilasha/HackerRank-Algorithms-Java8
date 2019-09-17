/*	Kangaroo
	
	You are choreograhing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

	The first kangaroo starts at location  and moves at a rate of  meters per jump.
	The second kangaroo starts at location  and moves at a rate of  meters per jump.
	You have to figure out a way to get both kangaroos at the same location as part of the show.

	Complete the function kangaroo which takes starting location and speed of both kangaroos as input, and return  or appropriately. Can you determine if the kangaroos will ever land at the same location at the same time? The two kangaroos must land at the same location after making the same number of jumps.

	Input Format

	A single line of four space-separated integers denoting the respective values of , , , and .

	Constraints

	Output Format

	Print YES if they can land on the same location at the same time; otherwise, print NO.

	Note: The two kangaroos must land at the same location after making the same number of jumps.	*/
	
import java.io.*;
import java.util.*;

public class task013 {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        double numJumps = (double)(x2 - x1) / (double)(v1 - v2);
        String answer = (numJumps > 0 && Math.round(numJumps) == numJumps) ? "YES" : "NO";
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] x1V1X2V2 = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(x1V1X2V2[0]);
        int v1 = Integer.parseInt(x1V1X2V2[1]);
        int x2 = Integer.parseInt(x1V1X2V2[2]);
        int v2 = Integer.parseInt(x1V1X2V2[3]);
        String result = kangaroo(x1, v1, x2, v2);
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
