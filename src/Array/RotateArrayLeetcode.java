package Array;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class RotateArrayLeetcode {
  static   public void rotate(int[] nums, int k) {

      int j=nums.length-1;
      int l=k;
        for (int i = k+1; i < nums.length; i++) {
            int temp=nums[l];
           // System.out.println(temp);
            nums[l]=nums[j];
            nums[j]=temp;
            l--;
            j--;
            System.out.println(l+" "+j);
           System.out.println(Arrays.toString(nums));

        }
        System.out.println(Arrays.toString(nums));
    }
    static   public void rotate1(int[] nums, int k){
        if(k> nums.length)
            return;
      int diff= nums.length-k;
        System.out.println(diff);
      int copy=k;

        Stack<Integer> s=new Stack<>();
        int l=nums.length-1;
        while (k>0)
        {
            s.push(nums[l]);
            l--;
            k--;
        }


        int j=nums.length-1;
        for (int i = diff-1; i >=0 ; i--) {
            nums[j]=nums[i];
            j--;

        }


        int o=0;
        while (copy>0)
        {
            nums[o]=s.pop();
            o++;
            copy--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
