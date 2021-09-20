package Array;

import java.util.Arrays;

public class ChocolateDistrubutionProblem {
    static int check(int arr[],int n, int m)
    {
        Arrays.sort(arr);
        int currentMin=Integer.MAX_VALUE;
        for (int i = 0; i+m-1 < n; i++) {

            int diff=arr[i+m-1]-arr[i];
            if(diff<currentMin)
                currentMin=diff;
        }

        return currentMin;
    }

    public static void main(String[] args) {
        int arr[]={3,4,1,9,56,7,9,12};
        System.out.println(check(arr, arr.length, 5));
    }
}
