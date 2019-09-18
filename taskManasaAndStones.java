import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class taskManasaAndStones {

    // Complete the stones function below.

    /**
     * We don't need to keep all the permutations. We just need to keep possible stones on
     * a previous step and possible stones on the current step. The first step we add manually,
     * it is only one number "0". As we don't count this step, the for-loop starts from 1, not
     * from 0 as usual.
     * @param n number of steps
     * @param a possible difference
     * @param b possible difference
     * @return all possible stone numbers sorted ascending
     */
    static int[] stones(int n, int a, int b) {
        Set<Integer> prevPermutation = new HashSet<>(),
                      currentPermutation = new HashSet<>();
        prevPermutation.add(0);
        for (int i = 1; i < n; i++) {
            for (Integer stone : prevPermutation) {
                currentPermutation.add(stone + a);
                currentPermutation.add(stone + b);
            }
            prevPermutation = currentPermutation;
            currentPermutation = new HashSet<>();
        }
        return prevPermutation.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = stones(n, a, b);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));
                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}