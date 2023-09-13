import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String situation = sc.nextLine();
        
        if (isDangerous(situation)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
    
    public static boolean isDangerous(String situation) {
        int consecutiveOnes = 0;
        int consecutiveZeros = 0;
        
        for (char c : situation.toCharArray()) {
            if (c == '0') {
                consecutiveOnes = 0;
                consecutiveZeros++;
            } else {
                consecutiveZeros = 0;
                consecutiveOnes++;
            }
            
            if (consecutiveOnes >= 7 || consecutiveZeros >= 7) {
                return true; // Situation is dangerous
            }
        }
        
        return false; // Situation is not dangerous
    }
}
