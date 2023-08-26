package phase1.arrays;

//TODO: Need to revisit again
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] inputArray = {1,2,3,3,3,4,4,5,6,6,7,8};   //6,6,6,6 -> 6,6,6 -> 6,6 ->6,8
        removeDuplicateFromSortedArray(inputArray);
    }

    //if n+1 is equal to n then shift left
    private static void removeDuplicateFromSortedArray(int [] arr) {
       int res = 1;

       for(int i = 1;  i < arr.length; i++) {
           if(arr[i] != arr[res-1]) {
               arr[res] = arr[i];
               res++;
           }
        }

       for(int i = 0; i < res; i++) {
           System.out.print(arr[i] + " ");
       }


    }
}
