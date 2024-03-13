package phase2.array;


/**
 * Find max difference in array elements arr[j]-arr[i] such that j > i
 */
public class StockBuySell {

    public static void main(String[] args) {
      int [] stocks = {10,20,30};
      System.out.println(stockBuySell(stocks));
    }

    private static int stockBuySell(int [] arr) {
        int maxProfit = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] > arr[i]) {
                maxProfit = maxProfit + arr[i+1] - arr[i];
            }
        }
        return maxProfit;
    }

}
