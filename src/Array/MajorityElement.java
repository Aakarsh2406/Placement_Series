package Array;
public class MajorityElement {
    public int majorityElement(int[] nums) {// Boyer-Moore Voting Algorithm
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement obj=new MajorityElement();
        int arr[]={3,2,3};
        System.out.println(obj.majorityElement(arr));
    }
}
