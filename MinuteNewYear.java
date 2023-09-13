import java.util.Scanner;
public class MinuteNewYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int hr=sc.nextInt();
            int min=sc.nextInt();
            System.out.println(((24-hr)*60)-(min));
        }
    }
}
