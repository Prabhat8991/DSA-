package phase2.array;

public class ShiftZeroes {

    public static void main(String[] args) {
        int[] testArray = {0,1,0,1,0,1,0,1};
        shiftZeroesSecondWay(testArray);
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

    public static void shiftZeroesSecondWay(int[] arr) {
        int pt1 = 0;
        int pt0 = arr.length - 1;

        while (pt1 < pt0) {

            if (arr[pt1] == 1) {
                pt1++;
            }

            if (arr[pt0] == 0) {
                pt0--;
            }

            if (pt1 > pt0) {
                break;
            }

            if (arr[pt1] != 1 && arr[pt0] != 0) {

                arr[pt1] = 1;
                arr[pt0] = 0;
            }

        }
    }

}
