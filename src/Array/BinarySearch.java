package Array;

public class BinarySearch {
    static int search(int arr[], int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else return mid;

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,0,8,10};
        int target=0;
        System.out.println(search(arr,target));
    }
}
