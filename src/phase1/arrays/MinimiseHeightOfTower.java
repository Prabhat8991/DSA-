package phase1.arrays;

public class MinimiseHeightOfTower {

    public static void main(String[] args) {

    }

    int getMinDiff(int[] arr, int n, int k) {
        // code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return (max-k) - (min+k);
    }
}
