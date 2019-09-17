/*	Cats and a Mouse

	Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse doesn't move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

	You are given  queries in the form of , , and  representing the respective positions for cats  and , and for mouse . Complete the function  to return the appropriate answer to each query, which will be printed on a new line.

	If cat  catches the mouse first, print Cat A.
	If cat  catches the mouse first, print Cat B.
	If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
	Input Format

	The first line contains a single integer, , denoting the number of queries. 
	Each of the  subsequent lines contains three space-separated integers describing the respective values of  (cat 's location),  (cat 's location), and  (mouse 's location).

	Constraints

	Output Format

	For each query, return Cat A if cat  catches the mouse first, Cat B if cat  catches the mouse first, or Mouse C if the mouse escapes.	*/
	
import java.util.Scanner;

public class task025 {

    static String catAndMouse(int x, int y, int z) {
        int difference = Math.abs(x-z) - Math.abs(y-z);
        return (difference < 0) ? "Cat A" : ((difference > 0) ? "Cat B" : "Mouse C");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int q = sc.nextInt();
            for (int i = 0; i < q; i++)
                System.out.println(
                    catAndMouse(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }
}