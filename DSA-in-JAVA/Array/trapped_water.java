import java.util.Scanner;

// package DSA-in-JAVA.Array;

public class trapped_water {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={4,2,0,6,3,2,5};
        int tw=0;

        int leftmaxarr[]=new int[arr.length];
        int rightmaxarr[]=new int[arr.length];

        int leftmaxele=arr[0];
        int rightmaxele=arr[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>leftmaxele)
            {
                leftmaxele=arr[i];
            }
            leftmaxarr[i]=leftmaxele;
            // System.out.print(leftmaxele);
        }
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]>rightmaxele)
            {
                rightmaxele=arr[i];
            }
            rightmaxarr[i]=rightmaxele;
            // System.out.print(rightmaxele);
        }

        for (int i = 0; i < arr.length; i++) {
            tw+=(Math.min(rightmaxarr[i], leftmaxarr[i])-arr[i]);
        }

        System.out.println("Trapped Water : "+tw);
    }
}
