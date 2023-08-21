import java.util.Scanner;

public class Sum_Equ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int N = sc.nextInt();

        System.out.println("Sum: "+(N*(N+1)/2));
    }
}
