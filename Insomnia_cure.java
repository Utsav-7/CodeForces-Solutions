import java.util.Scanner;

public class Insomnia_cure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int damagedDragons = 0;
        
        for (int dragon = 1; dragon <= d; dragon++) {
            if (dragon % k == 0 || dragon % l == 0 || dragon % m == 0 || dragon % n == 0) {
                damagedDragons++;
            }
        }
        
        System.out.println(damagedDragons);
    }
}
