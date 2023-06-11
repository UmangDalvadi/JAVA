import java.util.Scanner;

public class countsetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n1 = sc.nextInt();

        int count = 0;

        while (n1 > 0) {

            if ((n1 & 1) == 1) {
                count++;
            }
            n1 = n1 >> 1;

        }

        System.out.println("Ans : " + count);

        // System.out.println("Ans : " + (n1 & (n1-1)));
    }
}
