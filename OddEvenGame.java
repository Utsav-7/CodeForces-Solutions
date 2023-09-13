import java.util.Scanner;

public class OddEvenGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int diff = Math.abs(a - b);
            
            if (diff == 0) {
                System.out.println("0");
            } else if (a < b) {
                if (diff % 2 == 0) {
                    System.out.println("2");
                } else {
                    System.out.println("1");
                }
            } else {
                if (diff % 2 == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }
        }
        
        scanner.close();
    }
}

