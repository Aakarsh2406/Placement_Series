package Array;

import java.util.HashSet;
import java.util.Set;

public class MaximumConsecutive {
    static int findSubstring(int arr[])
    {

        int left,right,maxlength;
        left=right=maxlength=0;
        Set<Integer> substring=new HashSet<>();
        while (right<arr.length)
        {
            int  ch=arr[right];
            if(substring.add(ch))
            {
                right++;
                maxlength=Math.max(maxlength,substring.size());

            }
            else {

                substring.remove(arr[left]);
                left++;
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(findSubstring(arr));
    }
}
