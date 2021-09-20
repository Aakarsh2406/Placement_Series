package Array;



import java.util.Arrays;
import java.util.Hashtable;

public class twoSum_optimized_code {
    static int [] sum(int arr[], int target)
    {
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        int res[]=new int[2];
        for (int i = 0; i < arr.length ; i++) {
            int diff=target-arr[i];
            if(!ht1.containsKey(diff)) {

                ht1.put(arr[i], i);

            }
            else {
             res[0]=ht1.get(diff)+1;
             res[1]=i+1;}
        }
        return res;

    }

    public static void main(String[] args) {
        int rr[]={2,3,4};
        System.out.println(Arrays.toString( sum(rr,6)));
    }
}
