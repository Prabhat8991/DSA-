package arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int [] arr = {1,1,1,0,1,1,1,1};
        System.out.print(maxConsecutiveOnes(arr));
    }

    private static int maxConsecutiveOnes(int [] arr) {

        int maxCount = 0;
        int countOfOnes = 0;

        for(int i = 0; i < arr.length ; i++) {
            if(arr[i] == 1) {
                countOfOnes++;
                maxCount = Math.max(countOfOnes, maxCount);
            } else {
                countOfOnes = 0;
            }
        }
        return maxCount;
    }
}
