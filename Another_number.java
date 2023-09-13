import java.util.Scanner;

public class Another_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int diff = Math.abs(a - b); // Calculate the absolute difference between a and b
            int moves = (diff + 9) / 10; // Calculate the minimum number of moves needed

            System.out.println(moves);
        }
    }
}
