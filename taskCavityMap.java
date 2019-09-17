import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class taskCavityMap {
    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
        String[] result = new String[grid.length];
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid[i].length(); j++) {
                if (i == 0 || i == grid.length-1 || j == 0 || j==grid[i].length()-1) {
                    sb.append(grid[i].charAt(j));
                    continue;
                }
                int depth = Integer.parseInt(String.valueOf(grid[i].charAt(j)));
                if (depth > Integer.parseInt(String.valueOf(grid[i-1].charAt(j)))
                        && depth > Integer.parseInt(String.valueOf(grid[i+1].charAt(j)))
                        && depth > Integer.parseInt(String.valueOf(grid[i].charAt(j-1)))
                        && depth > Integer.parseInt(String.valueOf(grid[i].charAt(j+1))))
                    sb.append("X");
                else
                    sb.append(grid[i].charAt(j));
            }
            result[i] = sb.toString();
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
