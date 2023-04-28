import java.util.Scanner;

public class insertion_sort {
    
    // package DSA-in-JAVA.Sorting Algorithm;
    static void insertionsort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;
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

        insertionsort(arr);
        printsort(arr);
    }
}


