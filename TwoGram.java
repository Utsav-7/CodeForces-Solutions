import java.util.*;

public class TwoGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String s = sc.nextLine().trim();

        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string and count occurrences of two-grams
        for (int i = 0; i < n - 1; i++) {
            String twoGram = s.substring(i, i + 2);
            frequencyMap.put(twoGram, frequencyMap.getOrDefault(twoGram, 0) + 1);
        }

        // Find the two-gram with the maximum frequency
        String maxTwoGram = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxTwoGram = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.println(maxTwoGram);
    }
}
