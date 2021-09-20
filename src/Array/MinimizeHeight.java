package Array;

import java.util.Arrays;

public class MinimizeHeight {
   static int claculateHeight(int arr[],int k,int n)
    {
        for (int i = 0; i < n; i++) {
            if(i<k)
                arr[i]=arr[i]+k;
            if(i>=k)
                arr[i]=arr[i]-k;
        }
        //System.out.println(Arrays.toString(arr));
        return arr[n-1]-arr[0];

    }

    public static void main(String[] args) {
        int arr[]={3, 9, 12, 16, 20};
        System.out.println(claculateHeight(arr,3, arr.length));
    }
}
