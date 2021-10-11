package Array;

public class BestTimeToBuyStocks {
    public int profitOfStocks(int prices[])
    {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        BestTimeToBuyStocks obj=new BestTimeToBuyStocks();
        int arr[]={7,6,4,3,1};
        System.out.println(obj.profitOfStocks(arr));
    }
}
