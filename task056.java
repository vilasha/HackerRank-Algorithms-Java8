/*	Beautiful Triplets

	Erica wrote an increasing sequence of  numbers () in her notebook. She considers a triplet  to be beautiful if:

	Given the sequence and the value of , can you help Erica count the number of beautiful triplets in the sequence?

	Input Format

	The first line contains  space-separated integers  and , the length of the sequence and the beautiful difference. 
	The second line contains  space-separated integers .

	Output Format

	Print a single line denoting the number of beautiful triplets in the sequence.	*/
	
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class task056 {
    
    static int counter;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.next();
            int d = sc.nextInt(); sc.nextLine();
            Set<Integer> sequence = Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toSet());
            counter = 0;
            sequence.forEach(i -> {
                if (sequence.contains(i-d) && sequence.contains(i+d))
                    counter++;
            });
            System.out.println(counter);
        }
    }
}