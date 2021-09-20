package Array;

import java.util.Arrays;

public class cylicRotate {
    static  void rotate(int arr[])
    {
        int temp=arr[arr.length-1];
        int j=arr.length-1;
        for (int i = arr.length-1;i >0; i--) {
            arr[i]=arr[--j];
          //  j--;

        }
        arr[0]=temp;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        rotate(arr);
    }
}
