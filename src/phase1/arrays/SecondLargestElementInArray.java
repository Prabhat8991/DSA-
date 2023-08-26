package phase1.arrays;

public class SecondLargestElementInArray {

    public static void main(String[] args) {
        int [] inputArray = {99,0,3,0,5,0};
        System.out.println(getSecondLargestElement(inputArray));
    }

    public static int getSecondLargestElement(int[] arr) {
        int largest = 0;
        int secondLargest = 0;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i != largest){
                if (secondLargest == 0 || i > secondLargest) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }
}
