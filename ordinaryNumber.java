import java.util.Scanner;

public class ordinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Input number

            // Initialize the count of ordinary numbers to 0
            int count = 0;

            // Loop through each digit from 1 to 9
            for (int digit = 1; digit <= 9; digit++) {
                // Create the ordinary number by repeating the digit
                long ordinaryNumber = digit;

                // Keep adding the ordinary number to the count as long as it's less than or equal to n
                while (ordinaryNumber <= n) {
                    count++;
                    ordinaryNumber = ordinaryNumber * 10 + digit;
                }
            }

            System.out.println(count);
        }
    }
}


