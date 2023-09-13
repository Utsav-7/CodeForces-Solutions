import java.util.Arrays;
import java.util.Scanner;

public class restoring_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);
        int a = nums[3] - nums[0];
        int b = nums[3] - nums[1];
        int c = nums[3] - nums[2];

        System.out.println(a + " " + b + " " + c);

        scanner.close();
    }
}
