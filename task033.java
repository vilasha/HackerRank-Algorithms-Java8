/*	Beautiful Days at the Movies

	Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

	She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

	Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Print the number of beautiful days in the range.

	Input Format

	A single line of three space-separated integers describing the respective values of , , and .

	Constraints

	Output Format

	Print the number of beautiful days in the inclusive range between  and .	*/
	
import java.util.Scanner;

public class task033 {

    public static void main(String[] args) {
        int i, j, k, reverse;
        StringBuilder builder;
        int beautifulDays = 0;
        try (Scanner sc = new Scanner(System.in)) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
        }
        for (int s = i; s <=j; s++) {
            builder = new StringBuilder(String.valueOf(s));
            reverse = Integer.parseInt(builder.reverse().toString());
            if (Math.abs(s - reverse) % k == 0)
                beautifulDays++;
        }
        System.out.println(beautifulDays);
    }
}