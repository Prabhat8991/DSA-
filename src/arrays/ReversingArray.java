package arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int [] inputArray = {1,2,3,4,5,6,7,8,9,10};
        for(int i : reverseArrayForLoop(inputArray))
          System.out.println(i);
    }

    /* {1,3,6,8}
       {8,1,3,6}
       {6,8,1,3}
       {3,6,8,1}
       {}
    * */

    private static int [] reverseArray(int [] arr) {
        int low = 0;
        int high = arr.length -1;
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }

    private static int [] reverseArrayForLoop(int [] arr) {
        int high = arr.length -1;
        for(int low = 0; low < high; low++) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
        }
        return arr;
    }
}
