import java.util.Scanner;

public class powerofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n1 = sc.nextInt();

        if ((n1 & (n1 - 1)) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // System.out.println("Ans : " + (n1 & (n1-1)));
    }
}
