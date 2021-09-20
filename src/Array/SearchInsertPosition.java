package Array;

public class SearchInsertPosition {
    static int search(int nums[], int target)
    {
        int start=0;
        int flag3=0;
        int end=nums.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (target < nums[mid]) {
                end = mid - 1;
                flag3=start;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
              flag3=mid+1;
            }
            else
            {
                return mid;
            }

        }
        return flag3-1;
    }

    public static void main(String[] args) {
        int nums[]={2,3,4,5,8,10};
        int target=3;
        System.out.println(search(nums,target));
    }
}
