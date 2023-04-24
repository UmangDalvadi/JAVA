
import java.util.Scanner;
public class markSheet
{
    public static void main(String[] args){
        try (Scanner u = new Scanner(System.in)) {
            System.out.println("Enter OS marks : ");
            float a= u.nextFloat();
            System.out.println("Enter COA marks : ");
            float b= u.nextFloat();
            System.out.println("Enter DBMS marks : ");
            float c= u.nextFloat();
            System.out.println("Enter DSA marks : ");
            float d= u.nextFloat();
            System.out.println("Enter OOPs marks : ");
            float e= u.nextFloat();

            System.out.println("Total marks : "+(a+b+c+d+e));
            System.out.println("Percentage : "+(a+b+c+d+e)/5);
        }
    }
}
