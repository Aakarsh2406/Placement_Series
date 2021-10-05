package Array;

public class FindUnique { // find unique in array of all double elements except one
    int getUnique(int arr[])
    {
        int res=0;
        for (int element :
                arr) {
            res^=element;
        }
        return  res;
    }
    public static void main(String[] args) {
        int arr[]={7,7,8,8,9,9,4,4,5,5,6,1,1,2,2,3,3};
        FindUnique ob=new FindUnique();
        System.out.println("Unique: "+ob.getUnique(arr));
    }
}
