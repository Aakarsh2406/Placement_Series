package Array;

import java.util.Arrays;

public class KthSmallestNo {

void KthMin(int arr[],int k)
{
    Arrays.sort(arr);
    System.out.println(arr[k-1]);
}


    public static void main(String[] args) {


        KthSmallestNo obj=new KthSmallestNo();
        int arr[]={7,10,4,20,15};
        obj.KthMin(arr,4);



}}
