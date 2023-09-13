import java.util.Scanner;
public class EqualCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int min=Integer.MAX_VALUE;
            int count=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            for(int j=0;j<n;j++){
                count+=(arr[j]-min);
            }
            System.out.println(count);
        }
    }
}
