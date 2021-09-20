package Array;

import java.util.Arrays;

public class medianof2arrays {
   static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = nums1.length;
        int j = nums2.length;

        int[] arr3 = new int[i + j];


        System.arraycopy(nums1, 0, arr3, 0, i);
        System.arraycopy(nums2, 0, arr3, i, j);
        Arrays.sort(arr3);
        int n = arr3.length;


        if (n % 2 == 0)
        {
            int z = n / 2;
            int e = arr3[z];
            int q = arr3[z - 1];


            double ans = (double) (e + q) / 2;

            return ans;
        }

        else
        {
            int z = (n / 2);
            return arr3[z];
        }

    }

    public static void main(String[] args) {
        int arr1[]={1,2};
        int arr2[]={3,4};
        System.out.println(    findMedianSortedArrays(arr1,arr2));
    }
}
