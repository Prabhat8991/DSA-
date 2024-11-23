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
        if (arr == null || arr.length == 0) {
            return 0;  // handle empty or null array
        }

        int pt1 = 1; // Pointer for placing unique elements
        for (int pt2 = 1; pt2 < arr.length; pt2++) {
            // If the current element is different from the last unique element
            if (arr[pt2] != arr[pt1 - 1]) {
                arr[pt1] = arr[pt2]; // Place the unique element in the correct position
                pt1++; // Move the pointer for unique elements
            }
        }

        return pt1;
    }
}
