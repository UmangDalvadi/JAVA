import java.util.Scanner;

public class sortestpath {

    static boolean sp(String str, int x, int y) {

        String s = str.toUpperCase();

        // System.out.println(s);
        // System.out.println(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'N') {
                y++;
                // System.out.println(x);
            } 
            else if (s.charAt(i) == 'S') {
                y--;
                // System.out.println(x);

            }
             else if (s.charAt(i) == 'E') {
                x++;
                // System.out.println(y);

            }
             else if (s.charAt(i) == 'W') {
                x--;
                // System.out.println(y);

            }
            else{
                System.out.println("Wrong charactor in your string!!");
                return false;
            }

        }

        System.out.println("Final Origion : ( " + x + ", " + y + " )");

        System.out.println("Sortest path from Origion : "+Math.sqrt((x*x)+(y*y)));
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x=0, y = 0;
        System.out.println("Origion : ( " + x + ", " + y + " )");
        System.out.print("Enter string (N, S, E, W) : ");
        String str = sc.nextLine();

        sp(str, x, y);
    }
}
