package phase1.arrays;

public class StockByAndSellProblem {

    public static void main(String[] args) {
        int [] inputArray = {1,5,3,8,12};
        System.out.print(maxProfit(inputArray));
    }

    /**
     * Approach buy at down peak and sell at high peak
     */
    private static int maxProfit(int [] arr) {
        int profitSum = 0;
        for(int i = 1; i < arr.length ; i++) {
            if(arr[i] > arr[i-1]) {
                profitSum += arr[i] - arr[i-1];
            }
        }
        return profitSum;
    }
}
