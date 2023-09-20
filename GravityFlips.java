import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class GravityFlips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            Integer k=sc.nextInt();
            arr.add(k);
        }
        Collections.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
