/*	Bigger is Greater

	Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another string if it comes later in a lexicographically sorted list.

	Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:

	It must be greater than the original word
	It must be the smallest word that meets the first condition
	Complete the function biggerIsGreater below to create and return the new string meeting the criteria. If it is not possible, return no answer.

	Input Format

	The first line of input contains , the number of test cases. 
	Each of the next  lines contains .

	Constraints
	 will contain only letters in the range ascii[a..z].

	 Output Format
	For each test case, output the string meeting the criteria. If no answer exists, print no answer.	*/
	
import java.util.Scanner;
import java.util.Arrays;

public class task054 {
    
    private static String swapChars(char[] word) {
        int l = word.length;
        for (int i = l - 2; i >=0; i--)
            for (int j = l - 1; j > i; j--)
                if (word[i] < word[j]) {
                    char c = word[j];
                    word[j]= word[i];
                    word[i] = c;
                    Arrays.sort(word, i+1, l);
                    return String.valueOf(word);
                }
        return "no answer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
            System.out.println(swapChars(sc.next().toCharArray()));
        sc.close();
    }
}