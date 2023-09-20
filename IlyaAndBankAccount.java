import java.util.Scanner;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int maxAccount = n;

        if (n < 0) {
            int lastDigit = n % 10;
            int secondLastDigit = (n / 10) % 10;

            // Remove the last digit
            int withoutLastDigit = (n / 10);

            // Remove the second last digit
            int withoutSecondLastDigit = (n / 100) * 10 + lastDigit;

            maxAccount = Math.max(withoutLastDigit, withoutSecondLastDigit);
        }

        System.out.println(maxAccount);
    }
}


