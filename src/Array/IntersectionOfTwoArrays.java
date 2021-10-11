package Array;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        for (int i : nums1) {

            if (!hashMap1.containsKey(i)) {
                hashMap1.put(i, 1);
            } else {

                hashMap1.put(i, hashMap1.get(i) + 1);
            }
        }

        int n = 0;
        for (int i : nums2) {

            if (hashMap1.containsKey(i) && hashMap1.get(i) > 0) {
                nums2[n++] = i;
                hashMap1.put(i, hashMap1.get(i) - 1);
            }
        }
        return Arrays.copyOfRange(nums2, 0, n);
    }

    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int  arr2[]={2,2};
        IntersectionOfTwoArrays obj=new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(obj.intersect(arr1,arr2)));
    }
}
