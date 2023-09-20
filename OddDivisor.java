import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (hasOddDivisor(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean hasOddDivisor(long n) {
        if (n % 2 == 1) {
            return true;  // n is odd, and 1 is an odd divisor
        }

        while (n % 2 == 0) {
            n /= 2;  // Remove all powers of 2
        }

        return n > 1;  // If n is greater than 1, it has an odd divisor
    }
}
