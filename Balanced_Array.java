import java.util.Scanner;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the array
            
            if (n % 4 != 0) {
                System.out.println("NO"); // If there is no suitable answer
            } else {
                System.out.println("YES");
                int evenSum = 0;
                for (int i = 2; i <= n; i += 2) {
                    System.out.print(i + " ");
                    evenSum += i;
                }
                int oddSum = 0;
                for (int i = 1; i < n - 2; i += 2) {
                    System.out.print(i + " ");
                    oddSum += i;
                }
                System.out.println(evenSum - oddSum); // Print the last element
            }
        }
        
        scanner.close();
    }
}
