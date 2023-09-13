import java.util.Scanner;

public class polycarp_coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
            
            int c1 = n / 3;
            int c2 = n / 3;
            
            if (n % 3 == 1) {
                c1++;
            } else if (n % 3 == 2) {
                c2++;
            }
            
            System.out.println(c1 + " " + c2);
        }
    }
}
