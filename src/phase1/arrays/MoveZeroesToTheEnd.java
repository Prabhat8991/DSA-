package phase1.arrays;

//TODO: Revisit later
public class MoveZeroesToTheEnd {

    public static void main(String[] args) {
        int [] inputArray = {99,0,3,0,5,0};
        moveZeroesToEnd(inputArray);
    }
    /*
     {1,0,2,0,3,0,4} -> {1,2,3,4,0,0,0}
      1. when zero comes swap it with next non zero
      2. maintain the index of first zero
    */
    private static void moveZeroesToEnd(int [] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int temp = 0;
            if(arr[i] != 0) {
               temp = arr[i];
               arr[i] = arr[count];
               arr[count] = temp;
               count++;
            }
        }
        for(int i: arr) {
            System.out.print(i+ " ");
        }
    }
}
