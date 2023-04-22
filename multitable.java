
import java.util.Scanner;
public class multitable {

    static void table(int x){
        for (int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",x,i,x*i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number : ");
        int n=sc.nextInt();
        table(n);
    }
}
