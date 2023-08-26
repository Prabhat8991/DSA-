package phase1.arrays;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {
        int [] inputArray = {99,0,3,0,5,0};
        rotateArrayLeftByOne(inputArray);
    }

    private static void rotateArrayLeftByOne(int [] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        printArray(arr);
    }

    private static void printArray(int [] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}


