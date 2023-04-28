// package DSA-in-JAVA.Sorting Algorithm;

import java.util.Scanner;


public class Selection_sort {

    static void slectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
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

        slectionsort(arr);
        printsort(arr);
    }
}
