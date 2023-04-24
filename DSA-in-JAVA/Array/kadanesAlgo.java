

import java.util.Scanner;

public class kadanesAlgo {

    public static void maxsum(int arr[]) {
        int cs = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs< 0) {

                cs = 0;
            }
            max= Math.max(max, cs);
        }
        System.out.println("max : "+max);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of element in array : ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element no." + (i + 1));
                arr[i] = sc.nextInt();
            }

            maxsum(arr);
        }
    }
}
