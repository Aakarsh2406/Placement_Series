package Array;

public class FindMissingWithRepeating {
    static void check(int arr[])
    {
        int xorOfArray=0;
        for (int i = 0; i < arr.length; i++) {
            xorOfArray^=arr[i];
        }
        int anser=(1^2^3)-xorOfArray;
        System.out.println(anser);
    }

    public static void main(String[] args) {
        int arr[]={3,1,3};
        check(arr);
    }
}
