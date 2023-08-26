package phase1.arrays;

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
      int [] arr = {10,12,8,4};
      System.out.print(lengthOfLongestEvenOddSubArray(arr));
    }

    private static int lengthOfLongestEvenOddSubArray(int [] arr) {
        int maxLength = 0;
        for(int i = 1; i< arr.length; i++) {
           if(isEven(arr[i-1]) && !isEven(arr[i])) {
               maxLength+=1;
           }
            else if(!isEven(arr[i-1]) && isEven(arr[i])) {
                maxLength+=1;
            } else {
                maxLength = 0;
           }

        }
        return ++maxLength;
    }

    private static boolean isEven(int num) {
        return num %2 == 0;
    }

}
