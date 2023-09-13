import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long oddCount = (n + 1) / 2; 
        long evenCount = n / 2;    
        
        if (k <= oddCount) {
            // k is in the odd numbers part
            System.out.println(2 * k - 1);
        } else {
            // k is in the even numbers part
            System.out.println(2 * (k - oddCount));
        }
        
    }
}

