/*	ACM ICPC Team

	There are a number of people who will be attending ACM-ICPC World Finals. Each of them may be well versed in a number of topics. Given a list of topics known by each attendee, you must determine the maximum number of topics a 2-person team can know. Also find out how many ways a team can be formed to know that many topics. Lists will be in the form of bit strings, where each string represents an attendee and each position in that string represents a field of knowledge, 1 if its a known field or 0 if not.

	For example, given three attendees' data as follows:

	10101
	11110
	00010
	These are all possible teams that can be formed:

	Members Subjects
	(1,2)   [1,2,3,4,5]
	(1,3)   [1,3,4,5]
	(2,3)   [1,2,3,4]
	In this case, the first team will know all 5 subjects. They are the only team that can be created knowing that many subjects.

	Input Format

	The first line contains two space-separated integers  and , where  represents the number of attendees and  represents the number of topics.
	Each of the next  lines contains a binary string of length . If the th line's th character is , then the th person knows the th topic.

	Output Format

	On the first line, print the maximum number of topics a 2-person team can know. 
	On the second line, print the number of ways to form a 2-person team that knows the maximum number of topics.	*/
	
import java.util.Scanner;

public class task050 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), m = sc.nextInt();
            String[] attendee = new String[n];
            for (int i = 0; i < n; i++)
                attendee[i] = sc.next();
            int maxSkills = 0, numberOfWays = 0;
            for (int i = 0; i < n; i++) {
                String a = attendee[i];
                for (int j = i; j < n; j++) {
                    String b = attendee[j];
                    int teamSkills = 0;
                    for (int k = 0; k < m; k++)
                        teamSkills += (a.charAt(k) == '1' || b.charAt(k) == '1')
                            ? 1 : 0;
                    if (teamSkills > maxSkills) {
                        maxSkills = teamSkills;
                        numberOfWays = 1;
                    } else if (teamSkills == maxSkills)
                        numberOfWays++;
                }
            }
            System.out.println(maxSkills + "\n" + numberOfWays);
        }
    }
}