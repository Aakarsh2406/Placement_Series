package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonIn3Arrays {
    static void printCommon(Integer arr1[],Integer arr2[],Integer arr3[])
    {
        Set<Integer> set1=new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2=new HashSet<>(Arrays.asList(arr2));
        Set<Integer> set3=new HashSet<>(Arrays.asList(arr3));
        ArrayList<Integer> temp=new
                ArrayList<>();

        for (Integer value:set1
        ) {
            if(set2.contains(value)){
                temp.add(value);
            }
        }
   //     System.out.println(set3.toString());
        for (Integer value:temp
             ) {
            if(set3.contains(value));
            {
                System.out.print(value+" ");


            }
        }
     //   System.out.print("]");
     //   System.out.println();
    }

    public static void main(String[] args) {
      Integer ar1[] = {1, 5, 5};
     Integer   ar2[] = {3, 4, 5, 5, 10};
      Integer  ar3[] = {5, 5, 10, 20};
        printCommon(ar1,ar2,ar3);
    }
}
