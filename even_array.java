import java.util.Scanner;

public class even_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int oddCount = 0;
            int evenCount = 0;
            
            for (int i = 0; i < n; i++) {
                if (i % 2 != a[i] % 2) {
                    if (i % 2 == 0) {
                        oddCount++;
                    } else {
                        evenCount++;
                    }
                }
            }
            
            if (oddCount != evenCount) {
                System.out.println("-1");
            } else {
                System.out.println(oddCount);
            }
        }
    }
}
