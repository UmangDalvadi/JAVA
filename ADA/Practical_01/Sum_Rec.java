import java.util.Scanner;

public class Sum_Rec{

    static int sum(int n){

        // int s=0;
        
        
        if (n==1) {
            return 1;
        }
        
        else{
            // s+=n;
            // System.out.print(s);
            return n+sum(n-1);
        }
        
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // sum(n);

        System.out.println("Sum: "+sum(n));


    }
}