import java.util.Scanner;

public class New_Year_Harry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int total=0,count=0;;
        for(int j=1;j<=n;j++){
            total=total+j*5;
            if(total<=(240-k)){
                count++;
            }
        }
        System.out.println(count);
    }    
}
