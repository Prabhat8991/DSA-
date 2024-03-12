package phase2.array;

public class RotateArrayLeftByDPlaces {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6};
        int [] result = rotateArrayByD(testArray, 4);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    private static int[] rotateArrayByD(int [] arr, int d) {
        int[] resultArray = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            resultArray[(i - d + arr.length)%arr.length] = arr[i];
        }
        return resultArray;
    }
}
