import java.util.Scanner;

public class getithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter index for get Ith bit : ");
        int n2 = sc.nextInt();

        int bitmask = (1<<n2);

        if ((n1 & bitmask) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);

        }
    }

}
