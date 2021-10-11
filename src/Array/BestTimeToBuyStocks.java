package Array;

public class BestTimeToBuyStocks {
    public int profitOfStocks(int arr[])
    {
        int profit=0;
        int min,pos = 0,max;
        min=arr[0];

        for (int i = 1; i < arr.length; i++) {
           if(arr[i]<min) {
               min = arr[i];
               pos=i;
           }
        }
        if(pos==arr.length)
            return 0;
        max=arr[pos];
        for (int i = pos; i < arr.length; i++) {

            if(arr[i]>max)
                max=arr[i];
        }
        profit=max-min;
        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyStocks obj=new BestTimeToBuyStocks();
        int arr[]={7,6,4,3,1};
        System.out.println(obj.profitOfStocks(arr));
    }
}
