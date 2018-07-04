/*	Breaking the Records

	Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

	For example, assume her scores for the season are represented in the array . Scores are in the same order as the games played. She would tabulate her results as follows:

									 Count
	Game  Score  Minimum  Maximum   Min Max
	 0      12     12       12       0   0
	 1      24     12       24       0   1
	 2      10     10       24       1   1
	 3      24     10       24       1   1
	Given Maria's array of  for a season of  games, find and print the number of times she breaks her records for most and least points scored during the season.

	Input Format

	The first line contains an integer , the number of games. 
	The second line contains  space-separated integers describing the respective values of .

	Constraints

	Output Format

	Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.	*/
	
import java.io.*;
import java.util.*;

public class Solution {

    static int[] breakingRecords(int[] scores) {
        int minScore = scores[0];
        int maxScore = scores[0];
        int[] result = {0, 0};
        for (int num : scores) {
            if (num < minScore) {
                minScore = num;
                result[1]++;
            }
            if (num > maxScore) {
                maxScore = num;
                result[0]++;
            }
        }
        return (result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
