
import java.util.Scanner;
public class pattern_01 {
    static void ptr(int x){
        for (int i=0;i<=x;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num : ");
        int n=sc.nextInt();
        ptr(n);

    }
}