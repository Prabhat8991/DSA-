package phase1.arrays;

public class FrequenciesOfElementInArray {
    public static void main(String[] args) {
        int [] arr = {40,50,50,60,70};
        printFrequenciesOfElements(arr);
    }

    private static void printFrequenciesOfElements(int [] arr) {
        int n = arr.length;
        int count =0;
        for(int i = 0; i < n-1;i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            }
            else {
                System.out.println(arr[i] + "  " + ++count);
                count = 0;
            }
            if(i == n-2) {
                System.out.println(arr[i+1] + "  " + ++count);
            }
        }
    }
}
