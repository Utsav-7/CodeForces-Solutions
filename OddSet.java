import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int evenCount = 0;
            int oddCount = 0;
            
            for (int j = 0; j < 2 * n; j++) {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            if (evenCount == oddCount) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}
