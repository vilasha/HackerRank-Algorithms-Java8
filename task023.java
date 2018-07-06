/*	Counting Valleys

	Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike, he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step. Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. We define the following terms:

	A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
	A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
	Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.

	For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high. Finally, he returns to sea level and ends his hike.

	Input Format

	The first line contains an integer , the number of steps in Gary's hike. 
	The second line contains a single string , of  characters describing his path.

	Constraints

	Output Format

	Print a single integer denoting the number of valleys Gary walked through during his hike.	*/
	
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] path = scanner.next().toUpperCase().toCharArray();
        scanner.close();
        int position = 0;
        int valleysCount = 0;
        for (char c : path) {
            position += (c == 'U') ? 1 : -1;
            if (position == 0 && c == 'U')
                valleysCount++;
        }
        System.out.println(valleysCount);
    }
}
