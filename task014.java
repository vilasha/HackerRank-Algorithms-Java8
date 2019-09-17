/*	Between Two Sets

	You will be given two arrays of integers. You will be asked to determine all integers that satisfy the following two conditions:

	The elements of the first array are all factors of the integer being considered
	The integer being considered is a factor of all elements of the second array
	These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.

	Input Format

	The first line contains two space-separated integers describing the respective values of , the number of elements in array , and , the number of elements in array . 
	The second line contains  distinct space-separated integers describing . 
	The third line contains  distinct space-separated integers describing .

	Constraints

	Output Format

	Print the number of integers that are considered to be between  and .	*/
	
import java.io.*;
import java.util.*;

public class task014 {

    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int factorMin = a[a.length-1];
        int factorMax = b[0];
        boolean isFactor;
        int result = 0;
        for (int i = factorMin; i <= factorMax; i++) {
            isFactor = true;
            for (int num : a)
                if (i % num != 0) {
                    isFactor = false;
                    break;
                }
            if (!isFactor)
                continue;
            for (int num : b)
                if (num % i != 0) {
                    isFactor = false;
                    break;
                }
            if (isFactor)
                result++;
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nm = scan.nextLine().split(" ");
        int n = Integer.parseInt(nm[0].trim());
        int m = Integer.parseInt(nm[1].trim());
        int[] a = new int[n];
        String[] aItems = scan.nextLine().split(" ");
        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }
        int[] b = new int[m];
        String[] bItems = scan.nextLine().split(" ");
        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }
        int total = getTotalX(a, b);
        bw.write(String.valueOf(total));
        bw.newLine();
        bw.close();
    }
}