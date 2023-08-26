package phase1.arrays;

public class LeftRotateArrayByDPlaces {

    public static void main(String[] args) {
        int [] inputArray = {1,2,3};
        rotateArrayLeftByDPlaces(inputArray, 4);
    }

    /**
     * {2,3,4,5,6} d = 2
     *   1: {3,4,5,6,2}
     *   2: {4,5,6,2,3}
     */
    private static void rotateArrayLeftByDPlaces(int [] arr, int d) {
       reverseArray(arr, 0, d-1);
       reverseArray(arr, d, arr.length-1);
       reverseArray(arr, 0, arr.length -1);
       printArray(arr);
    }

    private static int [] reverseArray(int [] arr,int low, int high) {
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }

    private static void printArray(int [] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
