package numsay;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class sumofUniqueElements {

     static int sum(int nums[]) {
         Arrays.sort(nums);
         int count[]=new int[nums[nums.length-1]+1];
         int s=0;
         int j=0;
         for (int i = 0; i < nums.length; i++) {
             j=nums[i];
             count[j]++;
         }

         for (int i = 0; i < count.length; i++) {

             if(count[i]==1) s=s+i;


         }
    return s;
    }

    public static void main(String[] args) {
        int nums[]={10};
        System.out.println(sum(nums));
    }

}