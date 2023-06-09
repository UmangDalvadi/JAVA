
import java.util.Scanner;

public class clearIthbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter index for clear Ith bit : ");
        int n2 = sc.nextInt();

        int bitmask = ~(1 << n2);

        System.out.println("ans : " + (n1 & bitmask));
    }
}
