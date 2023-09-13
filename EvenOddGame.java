import java.util.Scanner;

public class EvenOddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Determine the winner based on the initial value of n
        if (n % 2 == 0) {
            // If n is even, Mahmoud wins
            System.out.println("Mahmoud");
        } else {
            // If n is odd, Ehab wins
            System.out.println("Ehab");
        }

        sc.close();
    }
}
