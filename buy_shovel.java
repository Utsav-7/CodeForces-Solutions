import java.util.Scanner;
public class buy_shovel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;i!=0;i++){
            if(k*i%10==r || k*i%10==0){
                System.out.println(i);
                break;
            }
        }
    }
}
