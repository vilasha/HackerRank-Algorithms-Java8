/*	Birthday Cake Candles

	You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

	For example, if your niece is turning  years old, and the cake will have  candles of height , , , , she will be able to blow out candles successfully, since the tallest candle is of height  and there are  such candles.

	Complete the function birthdayCakeCandles that takes your niece's age and an integer array containing height of each candle as input, and return the number of candles she can successfully blow out.

	Input Format

	The first line contains a single integer, , denoting the number of candles on the cake. 
	The second line contains  space-separated integers, where each integer  describes the height of candle .

	Constraints

	Output Format

	Print the number of candles that can be blown out on a new line.	*/
	
import java.util.*;
import java.util.stream.*;

public class task009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        List<Long> candles = Stream.of(S.split(" ")).map(Long::parseLong).collect(Collectors.toList());
        final Long tallestOne = candles.stream().mapToLong(l->l).max().getAsLong();
        long blownOut = candles.stream().filter(l->tallestOne.equals(l)).count();
        System.out.println(blownOut);
    }
}
