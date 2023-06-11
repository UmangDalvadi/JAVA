import java.util.Scanner;

public class clear_rangeofbits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter Ith num : ");
        int i = sc.nextInt();
        System.out.println("Enter Jth num : ");
        int j = sc.nextInt();

        int a = (~0) << (j+1);
        int b = (1<<i) -1;

        int bitmask=a|b;

        System.out.println("Ans : " + (n1 & bitmask));
    }
}
