import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[5][5];
        int col=0,row=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println(Math.abs(2-row)+Math.abs(2-col));
    }
}
