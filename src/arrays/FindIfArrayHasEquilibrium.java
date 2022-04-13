package arrays;

public class FindIfArrayHasEquilibrium {

    public static void main(String[] args) {
        int [] arr = {0,0,0,0,0};
        findEquilibriumPoint(arr);
    }

    private static void findEquilibriumPoint(int [] arr) {
        int sumOfArray = 0;
        for(int i = 0; i < arr.length; i++) {
            sumOfArray+=arr[i];
        }
        int sumRight = sumOfArray;
        int sumLeft = 0;
        for(int i = 0; i< arr.length ; i++) {
            sumRight = sumOfArray - (sumLeft+arr[i]);
            if(sumLeft == sumRight) {
                System.out.print(i);
                break;
            }
            sumLeft += arr[i];
        }
    }
}
