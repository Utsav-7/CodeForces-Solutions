import java.util.Scanner;

public class CardsFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int n = scanner.nextInt();
            
            int sheets = 1;
            
            while (w % 2 == 0 || h % 2 == 0) {
                if (w % 2 == 0) {
                    w /= 2;
                } else if (h % 2 == 0) {
                    h /= 2;
                }
                sheets *= 2;
            }
            
            if (sheets >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
