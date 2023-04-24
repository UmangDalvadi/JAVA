
import java.util.Scanner;
public class pattern_02 {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

        System.out.println("Enter a row number : ");
        int row=sc.nextInt();
        System.out.println("Enter a column number : ");
        int column=sc.nextInt();

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if ((i==0 || i==row-1) || (j==0 || j==column-1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
