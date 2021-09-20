package Array;

import java.util.Arrays;

class Codenation {
    static int[] calc(int arr[])
        {
            String str="";
            for (int value:arr
                 ) {
                str+=value;
            }
            int result=Integer.valueOf(str);
            System.out.println(result+1);

            return  arr;

    }
    public static void main(String[] args) {
      int arr[]={1,2,3};
      args[0]="1";
        System.out.println(Arrays.toString(calc(arr)));

    }
}