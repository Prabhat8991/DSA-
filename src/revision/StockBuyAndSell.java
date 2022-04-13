package revision;

import java.util.ArrayList;

public class StockBuyAndSell {


    public static void main(String[] args) {
      int [] stockPrice = {6, 5, 4, 3, 2, 1};
      stockBuySell(stockPrice, 6);
    }

    private static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        int buy = -1;
        int sell = -1;
        ArrayList<ArrayList<Integer> > resultHolder = new  ArrayList<ArrayList<Integer> >();
        for(int i = 0; i < n ; i++) {
            if(i<n-1 && (A[i] < A[i+1]) && buy == -1) {
                buy = i;
                sell = -1;
            }
            else if(i<n-1 && (A[i] > A[i+1]) && sell == -1 && buy != -1) {
                sell = i;
                ArrayList<Integer> result = new ArrayList<Integer>();
                result.add(buy);
                result.add(sell);
                resultHolder.add(result);
                buy = -1;
            }

            else if((i == n-1) && A[i]>A[i-1] && sell == -1 && buy != -1) {
                ArrayList<Integer> result = new ArrayList<Integer>();
                sell = i;
                result.add(buy);
                result.add(sell);
                resultHolder.add(result);
            }
        }
        return resultHolder;
    }}
