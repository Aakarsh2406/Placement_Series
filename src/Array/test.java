package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

        public static ArrayList<Integer> performOps(ArrayList<Integer> A) {
            ArrayList<Integer> B = new ArrayList<Integer>();
            for (int i = 0; i < 2 * A.size(); i++) B.add(0);
            for (int i = 0; i < A.size(); i++) {
                B.set(i, A.get(i));
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
            }
            return B;
        }

        public static void main(String[] args) {
            /********** Generate A **********/
            ArrayList<Integer> A =
                    new ArrayList<>(Arrays.asList(5,10,2,1));
            /********** End of Gen **********/
            // A = {5,10,2,1}
            ArrayList<Integer> B = performOps(A);
            for (int i = 0; i < B.size(); i++)
                System.out.print(B.get(i) + " ");
        }

    public static class bestTimeToBuyandSellStocks {
        static int checkprofit(int prices[])
        {
            int minimal=Integer.MAX_VALUE;
            int profit =0;
            for (int i = 0; i < prices.length; i++) {

                if(prices[i]<minimal) {
                    minimal = prices[i];
                }
                else if (prices[i]-minimal>profit)
                {
                    profit=prices[i]-minimal;
                }
            }
            return profit;

        }

        public static void main(String[] args) {
            int arr[]={7,1,5,6,3,4};
            System.out.println(checkprofit(arr));

        }
    }
};

