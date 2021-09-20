package Array;

public class MinimumAndMaximum {
    void minAndmax(int arr[])
    {
        int len=arr.length;
        int min,max=arr[0];
        min=arr[0];
        for (int i = 0; i <len-1 ; i++) {
            if(arr[i+1]<min)
                min=arr[i+1];
            else if (arr[i+1]>max)
                max=arr[i+1];
        }
        System.out.println(min+" "+max);

    }

    public static void main(String[] args) {


    MinimumAndMaximum obj=new MinimumAndMaximum();
    int arr[]={1000,11,445,1,330,3000};
    obj.minAndmax(arr);
}}
