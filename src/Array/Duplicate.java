package Array;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
  static   public int RemoveDuplicates(int nums[])
    {
        HashSet<Integer> check=new HashSet<Integer>();
        for (int value :
                nums) {
            if(check.contains(value)==false)
                check.add(value);
        }
        System.out.println(check);
        return check.size();
    }

    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(  RemoveDuplicates(arr));
    }
}
