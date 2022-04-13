package arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        int [] inputArray = {1,3,6,8};
        System.out.println(checkIfArrayIsSorted(inputArray));
    }

    private static boolean checkIfArrayIsSorted(int [] arr) {
        boolean isArraySorted = true;
        for (int i = 0; i< arr.length -1; i++) {
            if(arr[i] > arr[i+1]) {
                isArraySorted = false;
                break;
            }
        }
        return isArraySorted;
    }
}
