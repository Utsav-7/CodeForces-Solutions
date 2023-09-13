import java.util.Scanner;

public class bitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        while (n-- > 0) {
            String s=sc.next();
            if(s.charAt(0)=='+'){
                ++x;
            }else if(s.charAt(0)=='-'){
                --x;
            }else if(s.charAt(0)=='X' && s.charAt(1)=='+'){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }

}
