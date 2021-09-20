package Array;

import java.util.Arrays;

public class MergeTwoArrayWithoutExtraSpace {

    static void merger(int arr1[], int arr2[]) {

        int temp=0;
        int i=arr1.length-1;
        System.out.println(i);
        int j=0;
        while (i>=0 && j< arr2.length)
        {
            System.out.println(i+" "+j);
            if(arr1[i]>arr2[j])
            {
                temp=arr1[arr1.length-1];
                arr1[arr1.length-1]=arr2[j];
                arr2[j]=temp;

            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int arr1[]={1,3,5,8,10,89};
        int arr2[]={2,4,6};
        merger(arr1,arr2);
    }
}
