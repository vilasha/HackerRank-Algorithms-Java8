/*	Compare the Triplets

	Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

	We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

	Your task is to find their comparison points by comparing  with ,  with , and  with .

	If , then Alice is awarded  point.
	If , then Bob is awarded  point.
	If , then neither person receives a point.
	Comparison points is the total points a person earned.

	Given  and , can you compare the two challenges and print their respective comparison points?

	Input Format

	The first line contains  space-separated integers, , , and , describing the respective values in triplet . 
	The second line contains  space-separated integers, , , and , describing the respective values in triplet .

	Constraints

	Output Format

	Return an array of two integers denoting the respective comparison points earned by Alice and Bob.	*/
	
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] a = Arrays.stream(str.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        str = sc.nextLine();
        int[] b = Arrays.stream(str.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        sc.close();
        int aPoints = 0;
        int bPoints = 0;
        for (int i = 0; i < a.length; i++) {
            aPoints += (a[i] > b[i]) ? 1 : 0;
            bPoints += (b[i] > a[i]) ? 1 : 0;
        }
        System.out.println(aPoints + " " + bPoints);
    }
}
