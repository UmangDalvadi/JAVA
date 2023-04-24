
import java.util.Scanner;

public class pattern_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <i; k++) {
                
                System.out.print("* ");
            }
            System.out.print("\n");

        }
    }
}
