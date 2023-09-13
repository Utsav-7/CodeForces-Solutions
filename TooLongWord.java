import java.util.Scanner;

public class TooLongWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            int count=str.length()-1;
            if(str.length()<=10){
                System.out.println(str);
            }else{
                System.out.print(str.charAt(0));
                System.out.print(count-1);
                System.out.println(str.charAt(count));
            }
        }
    }    
}
