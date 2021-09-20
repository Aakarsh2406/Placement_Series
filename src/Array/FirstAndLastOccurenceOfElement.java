package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurenceOfElement {
    static int [] searchRange(int num[],int target)
    {
        int arr[]={-1,-1};
        int start=search(num,target,true);
        int end=search(num,target,false);
        arr[0]=start;
        arr[1]=end;

        return arr;
    }
  static int search(int nums[],int target,boolean checkForFirst){
        int ans=-1;
        int start=0;
        int end=nums.length;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<nums[mid])
                end=mid-1;
            else if (target>nums[mid])
                start=mid+1;
            else {
                ans=mid;
                if(checkForFirst)
                    end=mid-1;
                else start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={5,7,7,7,7,7,8,9};
        int target=7;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }


}
