package arrays;

public class PrefixSumTechnique {

    public static void main(String[] args) {
     int [] arr = {1,2,3,4,5,6};
     prefixSum(arr);
    }
    private static void prefixSum(int [] arr) {
        for(int i = 1; i< arr.length; i++) {
            arr[i]+= arr[i - 1];
        }

        //get sum from index l1 = 2 to l2 = 4
        // arr[l2] - arr[l1-1]
        System.out.print(arr[4] - arr[1]);
    }
}
