package phase2.array;

public class RemoveDuplicateElementsFromArray {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 2, 2, 3, 3, 4, 5, 5};
        System.out.println("Before removal.... ");
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
        int result = removeDuplicateElements(testArray);
        System.out.println("After removal.... ");
        for (int i = 0; i < result; i++) {
            System.out.println(testArray[i]);
        }

    }

    public static int removeDuplicateElements(int[] arr) {
        int pt1 = 1;
        int pt2 = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[pt1 - 1] != arr[pt2]) {
                arr[pt1] = arr[pt2];
                pt1++;
            }
            pt2++;
        }
        return pt1;
    }
}
