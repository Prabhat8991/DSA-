package phase1.arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
      int [] arr = {1,8,6,2,5,4,8,3,7};
      System.out.print(trapRainWater(arr));
    }

    /**
     *Approach find left max and right max for each element and
     * subtract arr[i] from the min(leftMax,rightMax)
     */
    private static int trapRainWater(int [] arr) {
        int [] leftMaxArr = new int[arr.length];
        int [] rightMaxArr = new int[arr.length];
        int leftMax = arr[0];
        int rightMax = arr[arr.length-1];
        int totalWaterUnits = 0;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1] > leftMax) {
                leftMax = arr[i-1];
            }
            leftMaxArr[i] = leftMax;
        }

        for(int i = arr.length -2; i > 0; i--) {
            if(arr[i+1] > rightMax) {
                rightMax = arr[i+1];
            }
            rightMaxArr[i] = rightMax;
        }

        for (int i = 1; i <arr.length-1; i++) {
            int min = Math.min(leftMaxArr[i], rightMaxArr[i]);
            if(arr[i] < min)
            totalWaterUnits+= min - arr[i];
        }
        return totalWaterUnits;
    }
}
