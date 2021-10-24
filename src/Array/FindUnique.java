package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUnique { // find unique in array of all double elements except one
    int getUnique(int arr[])
    {

        Set<Integer> set=new HashSet<Integer>();
        for (int elem :
                arr) {
            set.add(elem);


        }
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
