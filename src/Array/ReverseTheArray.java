package Array;

import java.util.Arrays;

public class ReverseTheArray {
   static int [] reverse(int arr[])
    {
        int temp=0;
        int n=arr.length;
        int j=n-1;
        for (int i = 0; i <n/2 ; i++) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            //System.out.println(Arrays.toString(arr));
        }

return arr;

    }

    public static void main(String[] args) {
       int arr[]={1,2};
        System.out.println( Arrays.toString(reverse(arr)));
    }
}
