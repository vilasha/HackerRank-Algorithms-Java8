import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class taskFairRations {

    // Complete the fairRations function below.

    /**
     * If sum of all elements is odd, doesn't matter how many pairs of bread we give,
     * it remains odd, i.e. at least one number remains odd
     *
     * If sum of elements is even, we find first odd element and start counting
     * until we meet next odd element. All elements between them will be changed:
     * the first one will be changed once, second - twice, third - three times, etc.
     * until we meet next odd element, i.e. number of given away breads will be
     * (indexOfSecondOddElement - indexOfFirstOddElement) * 2
     * We continue searching for pairs of odd elements until the end of the array
     * @param B array people, each number indicates how many loafs of bread the person holds initially
     * @return number of breads to give out so each person holds an even number of loafs. Or "NO" if
     * the solution is impossible
     */
    static String fairRations(int[] B) {
        if (Arrays.stream(B).sum() % 2 != 0)
            return "NO";

        boolean startCounting = false;
        int startCountingIndex = 0;
        int loafs = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 != 0) {
                if (startCounting) {
                    loafs += (i - startCountingIndex) * 2;
                }
                startCounting = !startCounting;
                startCountingIndex = i;
            }
        }
        return String.valueOf(loafs);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = fairRations(
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray());

        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
