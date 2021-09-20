package Array;

import java.util.Arrays;

public class SortArrayOF0_1_2 {
   static public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int temp=0;
        while(mid<=high)
        {
            switch(nums[mid])
            {
                case 0:{
                    temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int arr[]={1,2,0,1,0,2,0,1,0,2,1};
        sortColors(arr);
    }
}
