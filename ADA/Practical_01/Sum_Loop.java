import java.util.Scanner;

public class Sum_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}