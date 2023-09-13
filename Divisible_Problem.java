import java.util.*;

public class Divisible_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int steps = 0;
            if (a % b != 0) {
                steps = b - (a % b);
            }
            
            System.out.println(steps);
        }
    }
}
