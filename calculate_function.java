import java.util.*;

public class calculate_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long answer;

        if (n % 2 == 0) {
            answer = n / 2;
        } else {
            answer = -((n / 2) + 1);
        }

        System.out.println(answer);
    }
}
