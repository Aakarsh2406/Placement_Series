package Array;

public class KadaneAlgo {
    int largestContigousSum(int ar[])
    {
        int max_sofar=Integer.MIN_VALUE;
        int max_ending_here=0;
      //  max_sofar=max_ending_here=0;
        for (int i = 0; i <ar.length; i++) {

            max_ending_here=max_ending_here+ar[i];
            if(max_sofar<max_ending_here)
                max_sofar=max_ending_here;
            if(max_ending_here<0)
                max_ending_here=0;
        }
        return max_sofar;
    }

    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        KadaneAlgo obj=new KadaneAlgo();
        System.out.println(obj.largestContigousSum(arr));
    }
}

