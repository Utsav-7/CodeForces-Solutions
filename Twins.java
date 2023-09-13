import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            sum+=coins[i];
        }

        int minimumCoins = findMinimumCoins(coins,sum);
        System.out.println(minimumCoins);

    }

    public static int findMinimumCoins(int[] coins,int sum) {
        Arrays.sort(coins); // Sort the coins in ascending order
        int totalSum = sum;
        int mySum = 0;
        int coinsTaken = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            totalSum -= coins[i];
            mySum += coins[i];
            coinsTaken++;

            if (mySum > totalSum) {
                return coinsTaken;
            }
        }

        return coinsTaken;
    }
}
