import java.util.Scanner;

public class BackgoldProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Input integer n
        
        int k = n / 2; // Maximum possible number of primes in representation
        System.out.println(k);
        
        // Print k primes with their sum equal to n
        for (int i = 0; i < k - 1; i++) {
            System.out.print("2 ");
        }
        
        // If n is even, the last prime should be 2
        if (n % 2 == 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        
        scanner.close();
    }
}
