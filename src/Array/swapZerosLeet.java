package Array;

import java.util.Arrays;

public class swapZerosLeet {
   static public void moveZeroes(int[] nums) {
       int count = 0;
int n=nums.length;

       for (int i = 0; i < n; i++)
           if (nums[i] != 0)
               nums[count++] = nums[i];
       while (count < n)
           nums[count++] = 0;
       System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int arr[]={0,1,0};

        moveZeroes(arr);
    }
}
