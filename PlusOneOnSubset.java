import java.util.Scanner;

public class PlusOneOnSubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                if(min>arr[j])  
                    min=arr[j];
                if(max<arr[j])  
                    max=arr[j];
            }
            // min=findMinimum(arr);
            // max=findMaximum(arr);
            System.out.println(max-min);
        }
    }
    public static int findMinimum(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])  
                min=arr[i];
        }
        return min;
    }
    public static int findMaximum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])  
                max=arr[i];
        }
        return max;
    }
}
