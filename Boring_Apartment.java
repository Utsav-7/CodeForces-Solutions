import java.util.Scanner;

public class Boring_Apartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int x = scanner.nextInt(); // Apartment number
            int numDigits = (int) Math.log10(x) + 1; // Number of digits in the apartment number
            int totalKeyPresses = ((x%10)-1)*10 +(numDigits * (numDigits + 1)) / 2;
            
            System.out.println(totalKeyPresses);
        }
    }
}
