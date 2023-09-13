import java.util.Scanner;

public class minmal_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); // Rectangle side length a
            int b = scanner.nextInt(); // Rectangle side length b
            
            // Calculate the side length of the minimum square
            int sideLength = Math.max(Math.max(a, b), Math.min(a, b) * 2);
            int area = sideLength * sideLength;
            
            System.out.println(area);
        }
        
        scanner.close();
    }
}
