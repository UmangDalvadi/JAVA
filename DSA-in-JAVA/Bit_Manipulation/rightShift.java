import java.util.Scanner;


public class rightShift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();

        System.out.printf("Ans : " + (n1>>1));
    }
}
