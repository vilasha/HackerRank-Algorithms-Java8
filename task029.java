/*	The Hurdle Race

	Dan is playing a video game in which his character competes in a hurdle race. Hurdles are of varying heights, and Dan has a maximum height he can jump. There is a magic potion he can take that will increase his maximum height by  unit for each dose. How many doses of the potion must he take to be able to jump all of the hurdles.

	Given an array of hurdle heights , and an initial maximum height Dan can jump, , determine the minimum number of doses Dan must take to be able to clear all the hurdles in the race.

	For example, if  and Dan can jump  unit high naturally, he must take  doses of potion to be able to jump all of the hurdles.

	Input Format

	The first line contains two space-separated integers  and , the number of hurdles and the maximum height Dan can jump naturally. 
	The second line contains  space-separated integers  where .

	Constraints

	Output Format

	Print an integer denoting the minimum doses of magic potion Dan must drink to complete the hurdle race.	*/
	
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        int maxHeight = (int)Arrays.stream(sc.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .max()
            .getAsInt();
        sc.close();
        System.out.println(Math.max(0, maxHeight - K));
    }
}
