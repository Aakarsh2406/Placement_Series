package Array;

import java.util.Arrays;

public class medianofSortedArray {
 static    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        if(v.length%2==0)
        {
            int avg=(v[v.length/2]+v[(v.length/2)-1])/2;
            return avg;
        }
        else
            return v[v.length/2];
    }

    public static void main(String[] args) {

        int arr[]={90, 100, 78 ,89, 67};
        System.out.println(find_median(arr));
    }
}
