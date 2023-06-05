import java.util.Scanner;

public class BitwiseAND{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1=sc.nextInt();

        System.out.println("Enter Second number : ");
        int n2=sc.nextInt();

        System.out.printf("Ans : " + (n1&n2));
    }
}