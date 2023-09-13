import java.util.*;
public class elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]={1,2,3,4,5};
        int moves=0;
        while(x != 0 ){
            if(x<=1){
                moves++;
                x=x-1;
            }else if(x<=2){
                moves++;
                x=x-2;
            }else if(x<=3){
                moves++;
                x=x-3;
            }else if(x<=4){
                moves++;
                x=x-4;
            }else {
                moves++;
                x=x-5   ;
            }
        }
        System.out.println(moves);
    }
}
