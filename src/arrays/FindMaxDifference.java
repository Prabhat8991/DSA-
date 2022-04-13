package arrays;

public class FindMaxDifference {


    public static void main(String[] args) {
       int [] arr = {2,3,10,6,4,8,1};
       findMaximumDifference(arr);
    }

    private static void findMaximumDifference(int [] arr) {
        int minvalue = arr[0];
        int res = arr[1] - arr[0];

        for(int i = 0; i < arr.length; i++) {
            res = Math.max(res, arr[i] - minvalue);
            minvalue = Math.min(arr[i], minvalue);
        }
        System.out.print(res);
    }
}
