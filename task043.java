/*	Library Fine

	Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

	If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
	If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
	If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
	If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
	Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be .

	Input Format

	The first line contains  space-separated integers denoting the respective , , and  on which the book was returned. 
	The second line contains  space-separated integers denoting the respective , , and  on which the book was due to be returned.

	Output Format

	Print a single integer denoting the library fine for the book received as input.	*/
	
import java.util.Scanner;
import java.util.stream.Stream;
import java.time.LocalDate;

public class task043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] returnDate = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dueDate = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sc.close();
        int fine =  (LocalDate.of(returnDate[2], returnDate[1], returnDate[0]).isBefore(
                            LocalDate.of(dueDate[2], dueDate[1], dueDate[0]))) ? 0 :
                    (returnDate[2] > dueDate[2]) ? 10000 :
                    (returnDate[1] > dueDate[1] ) ? 500 * (returnDate[1] - dueDate[1]) :
                    (returnDate[0] > dueDate[0]) ? 15 * (returnDate[0] - dueDate[0]) : 0;
        System.out.println(fine);
    }
}