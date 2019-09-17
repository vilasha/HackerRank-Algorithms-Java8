/*	Jumping on the Clouds: Revisited

	Aerith is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be thunderheads or cumulus clouds. Her character must jump from cloud to cloud until it reaches the start again.

	To play, Aerith is given an array of clouds,  and an energy level . She starts from  and uses  unit of energy to make a jump of size  to cloud . If Aerith lands on a thundercloud, , her energy () decreases by  additional units. The game ends when Aerith lands back on cloud .

	Given the values of , , and the configuration of the clouds as an array , can you determine the final value of  after the game ends?

	For example, give  and , the indices of her path are . Her energy level reduces by  for each jump to . She landed on one thunderhead at an additional cost of  energy units. Her final energy level is .

	Note: Recall that  refers to the modulo operation. In this case, it serves to make the route circular. If Aerith is at  and jumps , she will arrive at .

	Input Format

	The first line contains two space-separated integers,  and , the number of clouds and the jump distance. 
	The second line contains  space-separated integers  where . Each cloud is described as follows:

	If , then cloud  is a cumulus cloud.
	If , then cloud  is a thunderhead.
	Constraints

	Output Format

	Print the final value of  on a new line.	*/
	
import java.util.Scanner;
import java.util.Arrays;

public class task038 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), k = sc.nextInt();
            sc.nextLine();
            int[] c = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
            int e = 100;
            int i = 0;
            do {
                i = (i + k) % n;
                e -= 1 + 2 * c[i];
            } while (i != 0);
            System.out.println(e);
        }
    }
}