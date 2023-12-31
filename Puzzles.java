import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] puzzles = new int[m];

        for (int i = 0; i < m; i++) {
            puzzles[i] = scanner.nextInt();
        }

        Arrays.sort(puzzles);

        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i <= m - n; i++) {
            int difference = puzzles[i + n - 1] - puzzles[i];
            minDifference = Math.min(minDifference, difference);
        }

        System.out.println(minDifference);
    }
}
