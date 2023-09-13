import java.util.Scanner;
import java.util.ArrayList;

public class sum_round {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
            ArrayList<String> digits = new ArrayList<>();
            int position = 1; 
            
            while (n > 0) {
                int digit = (n % 10) * position;
                if (digit != 0) {
                    digits.add(Integer.toString(digit));
                }
                n /= 10;
                position *= 10;
            }
            
            System.out.println(digits.size());  
            System.out.println(String.join(" ", digits));  
        }
        
        scanner.close();
    }
}
