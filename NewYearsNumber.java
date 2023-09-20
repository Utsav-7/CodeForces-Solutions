import java.util.Scanner;

public class NewYearsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean canRepresent = false;
            
            for (int m = 0; m * 2020 <= n; m++) {
                int k = (n - m * 2020) / 2021;
                if (k >= 0 && (n - m * 2020) % 2021 == 0) {
                    canRepresent = true;
                    break;
                }
            }
            
            if (canRepresent) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }    
    }
}

