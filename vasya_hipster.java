import java.util.Scanner;
public class vasya_hipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int red=sc.nextInt();
        int blue=sc.nextInt();
        int different=0,same=0;
        different=Math.min(red, blue);        
        same=Math.max(red,blue)-different;
        System.out.println(different+" "+same/2);
        
    }
}