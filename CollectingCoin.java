import java.util.Scanner;

public class CollectingCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            
            int max = Math.max(a, Math.max(b, c));
            int totalCoins = a + b + c + n;
            
            int remainder = totalCoins % 3;
            int equalShare = totalCoins / 3;
            
            if (max <= equalShare && remainder == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

