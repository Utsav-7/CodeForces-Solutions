import java.util.Scanner;
import java.lang.Math;

public class soft_drinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();

        int total_ml=k*l;
        int total_toast=total_ml/nl;
        int lime_enough=c*d;
        int salt_enough=p/np;
        int min1=Math.min(total_toast,lime_enough);
        System.out.println(Math.min(salt_enough,min1)/n);
    }    
}
