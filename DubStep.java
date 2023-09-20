import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] parts = str.split("WUB");
        StringBuilder ans = new StringBuilder();

        for (String part : parts) {
            if (!part.isEmpty()) {
                ans.append(part).append(" ");
            }
        }

        // Remove the trailing space
        if (ans.length() > 0) {
            ans.deleteCharAt(ans.length() - 1);
        }

        System.out.println(ans.toString());
    }
}

