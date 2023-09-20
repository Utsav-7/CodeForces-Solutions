import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = 2; // Start with k = 2 because k must be greater than 1
            
            // Find the value of x by repeatedly dividing n by 2^k
            while (n % ((1 << k) - 1) != 0) {
                k++;
            }
            
            int x = n / ((1 << k) - 1);
            
            System.out.println(x);
        }
        
    }
}

