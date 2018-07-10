/*	Angry Professor

	A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, he decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time () to arrived late ().

	Given the arrival time of each student, determine if the class is canceled.

	Input Format

	The first line of input contains , the number of test cases.

	Each test case consists of two lines.

	The first line has two space-separated integers,  (students in the class) and  (the cancelation threshold). 
	The second line contains  space-separated integers () describing the arrival times for each student.

	Note: Non-positive arrival times () indicate the student arrived early or on time; positive arrival times () indicate the student arrived  minutes late.

	Constraints

	Output Format

	For each test case, print the word YES if the class is canceled or NO if it is not.

	Note 
	If a student arrives exactly on time , the student is considered to have entered before the class started.	*/
	
import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            long onTime = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .filter(a -> a <= 0)
                .count();
            System.out.println((onTime < k) ? "YES" : "NO");
        }
        sc.close();
    }
}