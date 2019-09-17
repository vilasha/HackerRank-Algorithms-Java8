/*	Sock Merchant

	John works at a clothing store. He has a large pile of socks that he must pair them by color for sale.

	You will be given an array of integers representing the color of each sock. Determine how many pairs of socks with matching colors there are.

	John works at a clothing store and he's going through a pile of socks to find the number of matching pairs. More specifically, he has a pile of  loose socks where each sock  is labeled with an integer, , denoting its color. He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks,  and , are a single matching pair if they have the same color ().

	Given  and the color of each sock, how many pairs of socks can John sell?

	Input Format

	The first line contains an integer , the number of socks. 
	The second line contains  space-separated integers describing the colors  of the socks in the pile.

	Constraints

	 where 
	Output Format

	Print the total number of matching pairs of socks that John can sell.	*/
	
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.stream.Collectors;

public class task021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List pile = Arrays.stream(scanner.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        Set<Integer> colours = new HashSet<>(pile);
        int result = 0;
        for (int c : colours)
            result += Collections.frequency(pile, c) / 2;
        System.out.println(result);
    }
}