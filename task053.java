/*	Encryption

	An English text needs to be encrypted using the following encryption scheme. 
	First, the spaces are removed from the text. Let  be the length of this text. 
	Then, characters are written into a grid, whose rows and columns have the following constraints:

	For example, the sentence if man was meant to stay on the ground god would have given us roots after removing spaces is  characters long.  is between  and , so it is written in the form of a grid with 7 rows and 8 columns.

	ifmanwas  
	meanttos          
	tayonthe  
	groundgo  
	dwouldha  
	vegivenu  
	sroots

	Ensure that 
	If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. .
	The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next column and inserting a space, and so on. For example, the encoded message for the above rectangle is:
	imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

	You will be given a message to encode and print.

	Input Format

	One line of text, the string 

	Constraints
	 is comprised only of characteres in the range ascii[a-z].

	Output Format
	Print the encoded message on one line as described.	*/
	
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String s = "";
        StringBuilder encrypted = new StringBuilder();
        try (Scanner sc = new Scanner(System.in)) {
            s = sc.nextLine().replace(" ", "");
        }
        int L = s.length();
        int rows = (int)Math.floor(Math.sqrt(L));
        int columns = (int)Math.ceil(Math.sqrt(L));
        if (rows * columns < L)
            rows++;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++)
                encrypted.append((j * columns + i < L)
                                 ? s.charAt(j * columns + i) : "");
            encrypted.append(" ");
        }
        System.out.println(encrypted);
    }
}