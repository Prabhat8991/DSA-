package phase1.arrays;

public class LeadersInArray {

    public static void main(String[] args) {
        int [] inputArray = {7,10,4,10,6,5,2};
        leadersInArrayBestApproach(inputArray);
    }

    /**
     * 0(n2) solution
     */
    private static void leadersInArray(int [] arr) {
        boolean isLeader;
        for(int i = 0; i < arr.length -1 ; i++) {
            isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print(arr[arr.length -1]);
    }

    private static void leadersInArrayBestApproach(int [] arr) {
        int currentLeader = arr[arr.length -1];
        System.out.print(currentLeader + " ");
        for(int i = arr.length -2; i >= 0; i--) {
            if(arr[i] > currentLeader) {
                currentLeader = arr[i];
                System.out.print(currentLeader + " ");
            }
        }
    }
}
