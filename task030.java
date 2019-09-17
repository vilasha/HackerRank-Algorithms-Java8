/*	Designer PDF Viewer

	When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently. For example:

	In this challenge, you will be given a list of letter heights in the alphabet and a string. Using the letter heights given, determine the area of the rectangle highlight in  assuming all letters are  wide.

	Input Format

	The first line contains  space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z]. 
	The second line contains a single word, consisting of lowercase English alphabetic letters.

	Constraints

	, where  is an English lowercase letter.
	Word contains no more than  letters.
	Output Format

	Print a single integer denoting the area in  of highlighted rectangle when the given word is selected. Do not print units of measure.	*/
	
import java.util.*;

public class task030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = Arrays.stream(sc.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        String word = sc.next();
        sc.close();
        System.out.println(word.length() * 
                word.chars().map(c -> heights[c-97])
                .max().getAsInt());
    }
}