/*	Climbing the Leaderboard

	Alice is playing an arcade game and wants to climb to the top of the leaderboard. Can you help her track her ranking as she plays? The game uses Dense Ranking, so its leaderboard works like this:

	The player with the highest score is ranked number  on the leaderboard.
	Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
	We want to determine Alice's rank as she progresses up the leaderboard. For example, the four players on the leaderboard have high scores of , , , and . Those players will have ranks , , , and , respectively. If Alice's scores are ,  and , her rankings after each game are ,  and .

	You are given an array, , of monotonically decreasing leaderboard scores, and another array, , of Alice's scores for the game. You must print  integers. The  integer should indicate the current rank of alice after her  game.

	Input Format

	The first line contains an integer , the number of players on the leaderboard. 
	The next line contains  space-separated integers , the leaderboard scores in decreasing order. 
	The next line contains an integer, , denoting the number games Alice plays. 
	The last line contains  space-separated integers , her game scores.

	Constraints

	 for 
	 for 
	The existing leaderboard, , is in descending order.
	Alice's scores , are in ascending order.
	Subtask

	For  of the maximum score:

	Output Format

	Print  integers. The  integer should indicate the rank of alice after playing the  game.	*/
	
import java.util.Scanner;
import java.util.Stack;

public class task028 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> scores = new Stack<>();
        scores.push(in.nextInt());
        int current;
        for (int i = 1; i < n; i++) {
            current = in.nextInt();
            if (!scores.peek().equals(current))
                scores.push(current);
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            current = in.nextInt();
            while (scores.size() > 0 && current > scores.peek())
                scores.pop();
            System.out.println(
                scores.size() 
                + (scores.size() > 0 && scores.peek().equals(current) 
                        ? 0 : 1));
        }
    }
}