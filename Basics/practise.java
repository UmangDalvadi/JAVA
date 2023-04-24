

import java.util.Scanner;
public class practise {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

         System.out.println("Enter string : ");
         String str=sc.nextLine();
         System.out.println(str.toLowerCase());

         System.out.println("Enter string with space : ");
         String str1=sc.nextLine();
         System.out.println(str1.replace(' ', '_'));

        String u="Dear <|name|>, Thanks a lot";
        System.out.println("Enter your name : ");
        String str2=sc.nextLine();
        u=u.replace("<|name|>",str2);
        System.out.println(u);






    }
}
