package Array;

import java.util.Arrays;

public class acs {
    static  int check(int input1,int input2,int input3[])
    {
        Arrays.sort(input3);
        int sum=0;
        System.out.println(Arrays.toString(input3));
        int i=input3.length-1;
        while (input2>0)
        {
            sum+=input3[i];
            i--;
            input2--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={4,10,1};
        System.out.println(check(arr.length,3,arr));
    }
}
