package phase1.arrays;

public class LargestElementInArray {

    public static void main(String[] args) {
        int [] inputArray = {99,2,3,4,5,6};
        System.out.println(getLargestElement(inputArray));
    }

    public static int getLargestElement(int [] arr) {
        int largestNumber = Integer.MIN_VALUE;
        for(int i : arr) {
            if (i > largestNumber) {
                largestNumber = i;
            }
        }
        return largestNumber;
    }

}
