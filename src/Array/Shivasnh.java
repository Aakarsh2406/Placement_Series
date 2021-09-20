package Array;

import java.util.Arrays;

class Shivansh {
    static  int test(int arr[],int n)
    {
        Arrays.sort(arr);
        int smallest=arr[0];
        int longest=arr[n];
      return gcd(smallest,longest);


    }
    static int  gcd(int a, int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int arr[]={10,12,6,8,14,9};
        System.out.println(test(arr,arr.length-1));
    }
}
