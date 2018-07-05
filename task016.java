/*	Birthday Chocolate

	Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.

	Consider the chocolate bar as an array of squares, . She wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria: .

	Input Format

	The first line contains an integer , the number of squares in the chocolate bar. 
	The second line contains  space-separated integers , the numbers on the chocolate squares where . 
	The third line contains two space-separated integers,  and , Ron's birth day and his birth month.

	Constraints

	, where ()
	Output Format

	Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.	*/
	
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    static int solve(int[] s, int d, int m) {
        LinkedList<Integer> segment = new LinkedList<>
            (Arrays.stream(s).limit(m).boxed().collect(Collectors.toList()));
        int offset = 0;
        int result = 0;
        int sum = segment.stream().mapToInt(v->v).sum();
        result += (sum == d) ? 1 : 0;
        while (offset < s.length-m) {
            offset++;
            segment.removeFirst();
            segment.addLast(s[m+offset-1]);
            sum = segment.stream().mapToInt(v->v).sum();
            result += (sum == d) ? 1 : 0;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] s = new int[n];
        String[] sItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s[i] = sItem;
        }
        String[] dm = scanner.nextLine().split(" ");
        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);
        int result = solve(s, d, m);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}