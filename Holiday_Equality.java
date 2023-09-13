import java.util.Scanner;
public class Holiday_Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }    
        int max_num=find_max(arr);
        int cost=0;
        for(int k=0;k<n;k++){
            cost=cost+(max_num-arr[k]);
        }
        System.out.println(cost);

    }
    public static int find_max(int a[]){
        int max=0;
        for(int j=0;j<a.length;j++){
            if(max<a[j]){
                max=a[j];
            }
        }
        return max;
    }

}
