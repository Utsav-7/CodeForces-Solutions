import java.util.Scanner;

public class magicalStick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of sticks in the test case
            int result = (n + 1) / 2; // Maximum number of sticks with the same length
            System.out.println(result);
        }
    }
}
