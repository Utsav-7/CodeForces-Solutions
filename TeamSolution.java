import java.util.Scanner;
public class TeamSolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while(t-- > 0){
            int petya = sc.nextInt();
            int vasya=sc.nextInt();
            int tonya=sc.nextInt();

            if((petya==1 && vasya==1) || (vasya==1 && tonya==1) || (petya==1 && tonya==1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
