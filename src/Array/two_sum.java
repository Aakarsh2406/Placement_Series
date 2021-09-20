package Array;
import java.util.Arrays;
public class two_sum {
    static  int[] add(int nums[],int target)
    {
        int res[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                {
                    res[0]=i;
                    res[1]=j;
                    break;
                }



            }
        }


        return res;

    }

    public static void main(String[] args) {
        int arr[]={3,2,4,34,56,7,8,75,645,4536,74,74,5363,3737,362467,4744,4845};
        System.out.println(Arrays.toString(add(arr,4847)));
    }
}
