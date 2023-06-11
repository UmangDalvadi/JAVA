import java.util.Scanner;

public class clearlastIthbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter Ith num for clear bit : ");
        int i = sc.nextInt();

        int bitmask = (~0) << i;

        System.out.println("Ans : " + (n1 & bitmask));
    }
}
