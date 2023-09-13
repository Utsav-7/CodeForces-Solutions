import java.util.*;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float total=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            total=total+arr[i];
        }
        System.out.println(total/n);

    }
}
