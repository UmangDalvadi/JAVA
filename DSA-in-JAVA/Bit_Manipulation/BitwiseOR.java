// package DSA-in-JAVA.Bit_Manipulation;

import java.util.Scanner;
public class BitwiseOR {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1=sc.nextInt();

        System.out.println("Enter Second number : ");
        int n2=sc.nextInt();

        System.out.printf("Ans : " + (n1|n2));
    }
}
