package Array;

import java.util.Arrays;

public class MergeTwoArrayWithoutExtraSpace {

    static String merger(int[] arr1, int[] arr2) {

        if(arr1.length==0)
            return Arrays.toString(arr2);
        if(arr2.length==0)
            return Arrays.toString(arr1);

        int temp=0;
        int i=arr1.length-1;
        System.out.println(i);
        int j=0;
        while (i>=0 && j<= arr2.length-1)
        {
            System.out.println(i+" "+j);
            if(arr1[i]>arr2[j])
            {
                temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;

            }
            i--;
            j++;
        }
       Arrays.sort(arr1);
       Arrays.sort(arr2);
        return Arrays.toString(arr1)+" "+Arrays.toString(arr2);
    }

    public static void main(String[] args) {
        int arr1[]={3,5,4};
        int arr2[]={1,2,3};
        System.out.println( merger(arr1,arr2));
    }
}
