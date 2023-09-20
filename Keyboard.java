import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        String keyboard[] = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "z", "x", "c", "v", "b", "n", "m",",", ".", "/"};
        String ans = "";
        Scanner sc = new Scanner(System.in);
        String shift = sc.next();
        String words = sc.next();
        List<String> key = Arrays.asList(keyboard);
        int i = 0;
        if (shift.equals("R")) {
            while (i < words.length()) {
                if (key.contains(String.valueOf(words.charAt(i)))) {
                    int idx = key.indexOf(String.valueOf(words.charAt(i)));
                    ans = ans + keyboard[idx - 1];
                } else {
                    ans = ans + words.charAt(i);
                }
                i++;
            }
        } else {
            while (i < words.length()) {
                if (key.contains(String.valueOf(words.charAt(i)))) {
                    int idx = key.indexOf(String.valueOf(words.charAt(i)));
                    ans = ans + keyboard[idx + 1];
                } else {
                    ans = ans + words.charAt(i);
                }
                i++;
            }
        }
        System.out.println(ans);
    }
}
