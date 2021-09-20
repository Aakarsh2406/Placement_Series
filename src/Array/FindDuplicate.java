package Array;

import java.util.Arrays;

public class FindDuplicate {

static boolean duplicate(int arr[])
{
    for (int i = 0; i < arr.length-1; i++) {
        int abs1=Math.abs(arr[i]);
        if(arr[abs1]>=0){
            arr[abs1]=-arr[abs1];
        }
        else return true;
    }
  //  System.out.println(Arrays.toString(arr));
    return false;
}


    public static void main(String[] args) {
    int arr[]={1, 2, 3, 1};
        System.out.println( duplicate(arr));

    }    }
