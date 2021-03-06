package Array;
public class CelingOfANumber {
   static int ceilingNo(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if (target> arr[mid])
                start=mid+1;
            else return mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[]={2,4,7,9,10,12,15,16};
        int target=14;
        System.out.println("Ceiling number found at index= "+ceilingNo(arr,target));
    }
}
