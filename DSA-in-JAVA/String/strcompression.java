import java.util.Scanner;

public class strcompression {

    static String com(String str)
    {
        String stemp="";
        Integer count;
        for (int i = 0; i < str.length(); i++) {
            count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            stemp+=str.charAt(i);

            if(count>1)
            {
                stemp+=count.toString();
            }
        }
        return stemp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str=sc.nextLine();

        System.out.println(com(str));
    }
}
