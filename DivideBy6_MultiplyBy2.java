import java.util.Scanner;

public class DivideBy6_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Input integer n for each test case
            int moves = minMovesTo1(n); // Calculate minimum moves

            System.out.println(moves);
        }
    }

    static int minMovesTo1(int n) {
        int moves = 0;

        while (n != 1) {
            if (n % 6 == 0) {
                n /= 6;
            } else {
                n *= 2;
            }

            moves++;

            if (n < 1) {
                return -1; // If n becomes less than 1, it's impossible to reach 1.
            }
        }

        return moves;
    }
}
