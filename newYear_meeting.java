import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x1 = scanner.nextInt();  
        int x2 = scanner.nextInt();  
        int x3 = scanner.nextInt();  
        
        int minDistance = calculateMinDistance(x1, x2, x3);
        System.out.println(minDistance);
        
        scanner.close();
    }
    
    // Function to calculate the minimum total distance
    public static int calculateMinDistance(int x1, int x2, int x3) {
        int maxCoord = Math.max(x1, Math.max(x2, x3));
        int minCoord = Math.min(x1, Math.min(x2, x3));
        
        return maxCoord - minCoord;
    }
}
