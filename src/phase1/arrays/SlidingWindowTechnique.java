package phase1.arrays;

/**
 * Given an array of integers and a number K, find the maximum sum of K consecutive elements
 */

public class SlidingWindowTechnique {

    public static void main(String[] args) {
     int [] arr = {1,8,30,-5,20,7};
     System.out.print(maxSum(arr,3));
    }

    private static int maxSum(int [] arr, int k) {

        int curr_sum = 0;
        for(int i = 0; i<k; i++) {
            curr_sum+=arr[i];
        }
        int maxSum = curr_sum;
        for(int i = k; i< arr.length; i++) {
            curr_sum+=(arr[i] - arr[i - k]);
            if(maxSum < curr_sum) {
                maxSum = curr_sum;
            }
        }
        return maxSum;
    }

}
