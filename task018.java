/*	Migratory Birds

	You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings. Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.

	Input Format

	The first line contains an integer denoting , the number of birds sighted and reported in the array . 
	The second line describes  as  space-separated integers representing the type numbers of each bird sighted.

	Constraints

	It is guaranteed that each type is , , , , or .
	Output Format

	Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.	*/
	
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {
    static int migratoryBirds(int[] ar) {
        List list = Arrays.stream(ar).boxed().collect(Collectors.toList());
        Set<Integer> set = new TreeSet<>(list);
        int maxOccurences = 0;
        int resultId = 0;
        int currOccurences = 0;
        for (int id : set) {
            currOccurences = Collections.frequency(list, id);
            if (currOccurences > maxOccurences) {
                maxOccurences = currOccurences;
                resultId = id;
            }
        }
        return resultId;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] ar = Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        scanner.close();
        System.out.println(migratoryBirds(ar));
    }
}
