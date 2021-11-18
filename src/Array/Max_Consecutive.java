package Array;

public class Max_Consecutive {
    public static int max_cons(int nums[])
    {
        int max = 0;
        int count = 0;
        for(int i : nums){
            if(i != 1){
                max = Math.max(max, count);
                count = 0;
            }
            else{
                count++;
            }
        }
        return Math.max(count, max);
    }

    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(max_cons(arr));
    }
}
