import java.util.Scanner;

public class Die_Roll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Y = scanner.nextInt(); 
        int W = scanner.nextInt(); 
        int dotsPossibleRolls = 6 - Math.max(Y, W) + 1; 
        
        int gcd = gcd(dotsPossibleRolls, 6); 
        int numerator = dotsPossibleRolls / gcd;
        int denominator = 6 / gcd;
        
        System.out.println(numerator + "/" + denominator);
        
        scanner.close();
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
