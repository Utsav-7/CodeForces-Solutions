import java.util.*;
public class Soldier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k,n,w,total=0;
        k=sc.nextInt();
        n=sc.nextInt();
        w=sc.nextInt();
        for(int i=1;i<=w;i++){
            total=total+(k*i);
        }
        if(total<=n)
            System.out.println(0);
        else 
            System.out.println(total-n);
    }
}
