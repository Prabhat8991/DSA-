package phase1.arrays;

/**
 * Moore's Voting Algorithm
 */
public class MajorityElementOfArray {

    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2};
        System.out.print(getMajorityElementIndex(arr));
    }

    private static int getMajorityElementIndex(int [] arr) {
        // Step1: Find the candidate using Moore's Algo
        // Step2: Verify is Element is Majority element by
        //        traversing loop again check if candidate's occurence is more than N/2

        int count =1;
        int res = 0;

        for(int i =1; i<arr.length; i++) {
            if(arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                res = i;
                count = 1;
            }
        }
        return res;

        //Step:2 Needed if there is no majority element condition in problem. Else step 1 is good
    }
}
