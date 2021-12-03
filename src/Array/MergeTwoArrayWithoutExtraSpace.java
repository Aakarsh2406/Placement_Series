package Array;

import java.util.Arrays;

public class MergeTwoArrayWithoutExtraSpace {

    static void merger(int[] nums1, int[] nums2,int m, int n) {

        if(nums1.length==0)
            System.out.println(Arrays.toString(nums2));
        if(nums2.length==0)
            System.out.println(Arrays.toString(nums1));

        int temp=0;
        int i=nums1.length-1;

        int j=0;
        while (i>=0 && j<= nums2.length-1)
        {
            if(nums1[i]>nums2[j])
            {
                temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;

            }
            i--;
            j++;
        }
       Arrays.sort(nums1);
       Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums1)+" "+Arrays.toString(nums2));
    }
    static void merger1(int[] nums1, int[] nums2, int m, int n) {


        if(nums1.length==0)
            System.out.println(Arrays.toString(nums2));
        if(nums2.length==0)
            System.out.println(Arrays.toString(nums1));

        int temp=0;
        int i=nums1.length-1;

        int j=0;
        while (i>=0 && j<= nums2.length-1)
        {

            if(nums1[i]>nums2[j])
            {
                temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;

            }
            i--;
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums2);
        int result[]=new int[m+n];
        int o=0;
        for (int element:nums1
             ) {
            result[o]=element;
            o++;

        }
        System.out.println(o);
        for (int el :
                nums2) {
            result[o] = el;
            o++;
        }
        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        merger(nums1,nums2, nums1.length, nums2.length);
    }
}
