package Array;

import java.util.Arrays;

public class ReplacewithCorrespondingnumber {
    static void replace(int arr[])
    {
        int temp=0;
        int j=0;
        for (int i = 0; i < arr.length-1; i=i+2) {
            j=i+1;



                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={3,2,1,4};
        replace(arr);
    }
}
