// package DSA-in-JAVA.Sorting Algorithm;

import java.util.Scanner;


public class Count_sort {

    static void countsort(int[] arr) {

        int l= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
         l=Math.max(l, arr[i]);
        }

        int[] count=new int[l+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    static void printsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of an array : ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + i + " Element : ");
            arr[i] = sc.nextInt();
        }

        countsort(arr);
        printsort(arr);
    }
}
