// package DSA;

import java.util.Scanner;

// -in-JAVA.Sorting Algorithm;

public class Bubble_Sort {

    static void bubblesort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void printsort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of an array : ");
        int length=sc.nextInt();

        int []arr=new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter "+i+" Element : ");
            arr[i]=sc.nextInt();
        }

        bubblesort(arr);
        printsort(arr);
    }
    
}
