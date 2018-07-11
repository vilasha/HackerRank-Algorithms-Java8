/*	Sequence Equation

	You are given a sequence of  integers, . Each element in the sequence is distinct and satisfies . For each  where , find any integer  such that  and print the value of  on a new line.

	For example, assume you have the sequence . For each value of  between  and  we analyze as follows:

	Input Format

	The first line contains an integer , the number of elements in the sequence. 
	The second line contains  space-separated integers  where .

	Constraints

	, where .
	Each element in the sequence is distinct.
	Output Format

	For each  from  to , print an integer denoting any valid  satisfying the equation  on a new line.	*/
	
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Map<Integer,Integer> p = new HashMap<>();
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++)
                p.put(sc.nextInt(), i);
            for (int x = 1; x <=n; x++)
                System.out.println(p.get(p.get(x)));
        }
    }
}
