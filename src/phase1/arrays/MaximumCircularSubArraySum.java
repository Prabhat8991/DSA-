package phase1.arrays;

/**
 * Step1: Maximum sum of normal subarray using Kadane's
 * Step2: Maximum sum of circular subarray
 *     2.1: Find minimum sum of normal subarray
 *     2.2: Subtract this from total array sum
 *
 *     Result = Max(Step1, Step2)
 */

public class MaximumCircularSubArraySum {
    public static void main(String[] args) {
      int [] arr = {8, -4, 3, -5, 4}; //3,-4,5,6,-8
      System.out.print(maxCircularSubArraySum(arr));
    }

    private static int maxCircularSubArraySum(int [] arr) {
        int maxSum = arr[0];
        int minSum = arr[0];
        int maxSumOfNormalSubarray = 0;
        int minSumOfNormalSubarray = 0;
        int maxSumOfCircularSubarray = 0;

        int sumOfWholeArray = 0;

        for(int i = 1; i< arr.length; i++) {
            maxSum = Math.max(maxSum + arr[i], arr[i]);
            maxSumOfNormalSubarray = Math.max(maxSumOfNormalSubarray, maxSum);
        }

        for(int i = 1; i<arr.length; i++) {
            minSum = Math.min(minSum + arr[i], arr[i]);
            minSumOfNormalSubarray = Math.min(minSumOfNormalSubarray, minSum);
        }

        for(int i : arr) {
            sumOfWholeArray+= i;
        }

        maxSumOfCircularSubarray = sumOfWholeArray - minSumOfNormalSubarray;
        return Math.max(maxSumOfNormalSubarray, maxSumOfCircularSubarray);
    }
}
