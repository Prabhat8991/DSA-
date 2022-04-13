package arrays;

//Kadane's Algorithm
public class MaxSumOfSubArray {
    public static void main(String[] args) {
       int [] arr = {-5,1,-2,3,-1,2,-2};
       System.out.print(maxSumOfSubArray(arr));
    }

    private static int maxSumOfSubArray(int [] arr) {
        int maxSubArraySum = 0;
        int res = 0;

        for(int i = 1; i < arr.length ; i++) {
            maxSubArraySum = Math.max((maxSubArraySum+arr[i]), arr[i]);
            res = Math.max(res, maxSubArraySum);
        }
        return res;
    }
}
