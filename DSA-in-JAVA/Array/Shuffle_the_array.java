public class Shuffle_the_array {
    // class Solution {
    public static int[] shuffle(int[] nums, int n) {

        int temp1[] = new int[n];
        int temp2[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp1[i] = nums[i];
            temp2[i] = nums[i + n];
        }

        // int temp2[]=new int [n];
        // for(int i=n;i<nums.length;i++){
        // temp2[i]=nums[i];
        // }

        // for(int i=0;i<n;i++){
        // System.out.print(temp1[i]);
        // }
        // System.out.println();

        // for(int i=0;i<n;i++){
        // System.out.print(temp2[i]);
        // }
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 || i == 0) {
                nums[i] = temp1[j];
                j++;
            } else {
                nums[i] = temp2[k];
                k++;
            }

        }

        return nums;

    }
    // }

    public static void main(String[] args) {
        // [2,5,1,3,4,7]
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        shuffle(nums,n);
        // System.out.println(shuffle(nums, n));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
