package phase2.array;

public class ShiftZeroes {

    public static void main(String[] args) {
        int[] testArray = {0,1,2,3,0,1,5,3,0};
        shiftZeroes(testArray);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }

    public static void shiftZeroes(int[] arr) {
        int zeroTracker = 0;
        int counter = 0;

        while (counter < arr.length) {
            if (arr[zeroTracker] == 0) {
                if (arr[counter] != 0) {
                    arr[zeroTracker] = arr[counter];
                    arr[counter] = 0;
                }
            }
            if (arr[zeroTracker] != 0) {
                zeroTracker++;
            }
            counter++;
        }
    }
}
