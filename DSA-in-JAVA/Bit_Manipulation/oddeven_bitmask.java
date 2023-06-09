import java.util.Scanner;

public class oddeven_bitmask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n1 = sc.nextInt();

        int bitmask = 1;

        if ((n1 & bitmask) == 1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");

        }
    }
}
