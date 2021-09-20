package Array;

import java.util.Arrays;

public class MissingElement {
    static  int missing(int arr[],int n)
    {
        int totalSum=n*(n+1)/2;
        int currentSum=0;
        for (int value :
                arr) {
            currentSum+=value;
        }
        return totalSum-currentSum;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,10};
        Arrays.sort(arr);
        System.out.println(missing(arr, arr[arr.length-1]));
    }
}
