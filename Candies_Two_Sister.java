import java.util.Scanner;

public class Candies_Two_Sister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Number of candies
            
            // Calculate the number of ways to distribute candies
            int ways = (n - 1) / 2;
            System.out.println(ways);
        }
    }
}

