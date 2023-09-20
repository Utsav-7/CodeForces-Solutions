import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        int minDimension = Math.min(n, m);

        if (minDimension % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }
}
