/*	Drawing Book

	Brie’s Drawing teacher asks her class to open their books to a page number. Brie can either start turning pages from the front of the book or from the back of the book. She always turns pages one at a time. When she opens the book, page  is always on the right side:

	When she flips page , she sees pages  and . Each page except the last page will always be printed on both sides. The last page may only be printed on the front, given the length of the book. If the book is  pages long, and she wants to turn to page , what is the minimum number of pages she will turn? She can start at the beginning or the end of the book.

	Given  and , find and print the minimum number of pages Brie must turn in order to arrive at page .

	Input Format

	The first line contains an integer , the number of pages in the book. 
	The second line contains an integer, , the page that Brie's teacher wants her to turn to.

	Constraints

	Output Format

	Print an integer denoting the minimum number of pages Brie must turn to get to page .	*/
	
import java.util.Scanner;

public class task022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        scanner.close();
        int pagesToTurn = 0;
        if (p <= n / 2)
            pagesToTurn = p / 2;
        else
            pagesToTurn = n / 2 - p / 2;
        System.out.println(pagesToTurn);
    }
}