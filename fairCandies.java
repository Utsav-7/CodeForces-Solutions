import java.util.Scanner;

public class fairCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of candies
            
            int count1 = 0; // Count of candies weighing 1 gram
            int count2 = 0; // Count of candies weighing 2 grams
            
            for (int j = 0; j < n; j++) {
                int candyWeight = scanner.nextInt();
                if (candyWeight == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }
            
            // Check if the division can be fair
            if (count1 % 2 == 0 && (count2 % 2 == 0 || count1 >= 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
