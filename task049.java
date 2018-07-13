/*	Queen's Attack II

	You will be given a square chess board with one queen and a number of obstacles placed on it. Determine how many squares the queen can attack.

	A queen is standing on an  chessboard. The chess board's rows are numbered from  to , going from bottom to top. Its columns are numbered from  to , going from left to right. Each square is referenced by a tuple, , describing the row, , and column, , where the square is located.

	The queen is standing at position . In a single move, she can attack any square in any of the eight directions (left, right, up, down, and the four diagonals). In the diagram below, the green circles denote all the cells the queen can attack from :

	There are obstacles on the chessboard, each preventing the queen from attacking any square beyond it on that path. For example, an obstacle at location  in the diagram above prevents the queen from attacking cells , , and :

	Given the queen's position and the locations of all the obstacles, find and print the number of squares the queen can attack from her position at .

	Input Format

	The first line contains two space-separated integers  and , the length of the board's sides and the number of obstacles. 
	The next line contains two space-separated integers  and , the queen's row and column position. 
	Each of the next  lines contains two space-separated integers  and , the row and column position of .

	Constraints

	A single cell may contain more than one obstacle.
	There will never be an obstacle at the position where the queen is located.

	Output Format

	Print the number of squares that the queen can attack from position .	*/
	
import java.util.*;

public class Solution {
    private static int N, K, xQ, yQ;
    private static Set<String> obstacles = new HashSet<>();
    
    private static int checkDirection(int x, int y) {
        if (x == 0 && y == 0)
            return 0;
        boolean stop = false;
        int result = 0;
        int xPos = xQ;
        int yPos = yQ;
        while (!stop) {
            xPos += x;
            yPos += y;
            if (obstacles.contains(xPos + " " + yPos)
               || xPos < 1 || xPos > N
               || yPos < 1 || yPos > N)
                stop = true;
            else
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        xQ = sc.nextInt();
        yQ = sc.nextInt();
        if (K > 0)
            sc.nextLine();
        for (int i = 0; i < K; i++)
            obstacles.add(sc.nextLine());
        sc.close();
        int result = 0;
        for (int x = -1; x <= 1; x++)
            for (int y = -1; y <= 1; y++)
                result += checkDirection(x, y);
        System.out.println(result);
    }
}