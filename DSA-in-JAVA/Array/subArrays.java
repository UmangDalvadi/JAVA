
import java.util.Scanner;

public class subArrays {

    public static void sum(int arr[])
    {
        int t=0;
        int minsum=Integer.MAX_VALUE;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[ ");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+" ");
                    sum+=arr[j2];
                }
                System.out.print("], ");
                t++;
                if(minsum>sum){
                    minsum=sum;
                }
                if(maxsum<sum){
                    maxsum=sum;
                    // System.out.println(maxsum);
                }
                sum=0;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+t);
        System.out.println("maximum sum of a pair : "+maxsum);
        System.out.println("minimum sum of a pair : "+minsum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of element in array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element no."+(i+1));
            arr[i]=sc.nextInt();
        }

        sum(arr);

    }
}
