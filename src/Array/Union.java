package Array;

import java.util.*;

public class Union {
   static void convert(Integer arr1[])
    {

        Set<Integer> set=new HashSet<>(Arrays.asList(arr1));
        System.out.println(set);

    }
    static int convertIntersect(Integer arr[],Integer arr1[])
    {
        int count=0;
        Set<Integer> set1=new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2=new HashSet<>(Arrays.asList(arr1));
        for (Integer value:set1
             ) {
            if(set2.contains(value)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer arr[]={17,1,5,2,3,16};
        Integer arr1[]={3,8,6,20,7};
        int length = arr.length + arr1.length;
        Integer[] mergedArray = new Integer[length];
        int pos = 0;
        for (int element : arr)
        {
            mergedArray[pos] = element;
            pos++;
        }
        for (int element : arr1)
        {
            mergedArray[pos] = element;
            pos++;
        }


       convert(mergedArray);
        System.out.println( convertIntersect(arr,arr1));
    }
}
