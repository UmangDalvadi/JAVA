
import java.util.Scanner;
public class arr_foreach {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
//        for (int ele:arr )
//        {
//            System.out.println("enter "+ele +" Element");
//            arr[ele]= sc.nextInt();
//        }
        for (int i=0;i<arr.length;i++){
            System.out.println("enter "+i +" Element");
            arr[i]= sc.nextInt();
        }
        for(int ele:arr){
            System.out.println(ele);
        }

    }
}
