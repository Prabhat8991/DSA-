package arrays;

import java.util.ArrayList;

/***  i/p arr1 = {1,2,3}
      i/p arr2 = {3,4,5}
      Frequencies = 1 to 3  => 1,2,3
                    2 to 4  => 2,3,4
                    3 to 5  => 3,4,5

 Output: Element 3 comes in all the ranges and hence max frequency
*/
//0 <= l[i], r[i] <1000
public class MaxFrequenciesOfElementsInGivenRange {

    public static void main(String[] args) {
       int [] l = {1,2,3};
       int [] r = {3,4,5};
       System.out.print(maxFrequency(l,r,1000));
    }

    private static int maxFrequency(int [] l, int [] r, int n) {
        int [] arr = new int[n];

        for(int i = 0; i < l.length; i++) {
            arr[l[i]]++;
            arr[r[i]+1]--;
        }

        int max = arr[0], res = 0;

        for(int i = 1; i < arr.length ; i++) {
            arr[i]+=arr[i-1];
            if(max < arr[i]) {
                max = arr[i];
                res = i;

            }
        }
        return res;
    }

}
