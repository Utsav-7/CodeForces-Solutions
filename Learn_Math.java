import java.util.Scanner;

public class Learn_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int x, y;
        
        if (n % 2 == 0) {
            x = 4;
            y = n - x;
        } else {
            x = 9;
            y = n - x;
        }
        
        System.out.println(x + " " + y);
    }   
}
