package Array;

import java.util.Arrays;
import java.util.Collections;

public class SortfirstInascendingReminDescending {
    static void printOrder(Integer[] arr, int k)
    {
        int n = arr.length;

        // Sort first k elements in ascending order
        Arrays.sort(arr, 0, k);

        // Sort remaining n-k elements in descending order
        Arrays.sort(arr, k, n, Collections.reverseOrder());
    }

    public static void main(String[] args)
    {
        // Our arr contains 8 elements
        Integer[] arr = { 11,7,5,10,46,23,16,8 };
        int k = 3;
        printOrder(arr, k);
        System.out.printf("%s", Arrays.toString(arr));
    }
}
