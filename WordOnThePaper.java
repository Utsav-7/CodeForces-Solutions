import java.util.Scanner;

public class WordOnThePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        while (t-- > 0) {
            char[][] grid = new char[8][8];
            
            for (int i = 0; i < 8; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
            }
            
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (grid[j][i] != '.') {
                        word.append(grid[j][i]);
                    }
                }
            }
            
            System.out.println(word.toString());
        }
    }
}
