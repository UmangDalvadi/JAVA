import java.util.Scanner;

public class SpiralMatrics {

    static void spiral(int[][] arr) {

        int toprow = 0;
        int bottumrow = arr.length - 1;

        int leftcolumn = 0;
        int rightcolumn = arr[0].length - 1;

        while (toprow <= bottumrow && leftcolumn <= rightcolumn) {

            for (int i = leftcolumn; i <= rightcolumn; i++) {
                System.out.print(arr[toprow][i] + " ");
            }

            for (int i = toprow+1; i <= bottumrow; i++) {
                System.out.print(arr[i][rightcolumn] + " ");
            }

            for (int i = rightcolumn-1; i >= leftcolumn; i--) {
                if(toprow==bottumrow)
                {
                    break;
                }
                System.out.print(arr[bottumrow][i] + " ");
            }

            for (int i = bottumrow-1; i >= toprow+1; i--) {
                if(leftcolumn==rightcolumn)
                {
                    break;
                }
                System.out.print(arr[i][leftcolumn] + " ");
            }

            toprow++;
            bottumrow--;

            leftcolumn++;
            rightcolumn--;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================");

        System.out.print("Enter numbers of row : ");
        int row = sc.nextInt();
        System.out.print("Enter numbers of column : ");
        int column = sc.nextInt();

        System.out.println("==============================");

        int arr[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter [" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("==============================");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // System.out.print("Enter [" + i + "][" + j + "] : ");
                // arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("==============================");

        spiral(arr);
    }
}
