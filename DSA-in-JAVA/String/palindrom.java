// package DSA

import java.util.Scanner;

// -in-JAVA.String;

public class palindrom {

    static boolean pld(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string : ");
        String str = sc.nextLine();

        System.out.println(pld(str));

        // pld(str);
    }
}
