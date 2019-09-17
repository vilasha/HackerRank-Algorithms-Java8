/*	Jumping on the Clouds

	Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.

	For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided. For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and . She could follow the following two paths:  or . The first path takes  jumps while the second takes .

	Input Format

	The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .

	Output Format

	Print the minimum number of jumps needed to win the game.	*/
	
import java.util.Scanner;
import java.util.Arrays;

public class task047 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.nextLine();
            int[] c = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
            int i = 0, n = c.length, jumps = 0;
            while (i < n) {
                i += (i < n-2 && c[i+2] == 0) ? 2 : 1;
                jumps++;
            }
            System.out.println(--jumps);
        }
    }
}