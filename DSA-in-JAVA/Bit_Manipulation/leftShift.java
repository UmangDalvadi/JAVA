import java.util.Scanner;

public class leftShift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();

        System.out.printf("Ans : " + (n1<<2));
    }
}
