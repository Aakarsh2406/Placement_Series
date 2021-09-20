package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class longestSubsequences {
   static ArrayList<Integer> check(int arr[])
    {
        int y=0;
        ArrayList<ArrayList> list=new ArrayList<>();
        ArrayList<Integer> results=new ArrayList<>();
       Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                results.add(arr[i]);
               // System.out.print(i);

            }
            if(arr[i] + 1 != arr[i + 1]) {
                results.add(arr[i]);
                System.out.println("1 found list:"+results);
                list.add(results);
                y++;
                results.clear();
            }
        }

        System.out.println(list); // for debugging purpose

        return results;

    }

    public static void main(String[] args) {
        int arr[]={2,6,1,9,4,5,3,10,11,12,13,14,15,16,17,18};
        System.out.println("Second Found::"+check(arr));
    }
}
