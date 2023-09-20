import java.util.Scanner;

public class KefaFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxLength = 1;  // Minimum length is 1
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            
            maxLength = Math.max(maxLength, currentLength);
        }

        System.out.println(maxLength);
    }
}
