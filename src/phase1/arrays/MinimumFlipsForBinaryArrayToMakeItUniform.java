package phase1.arrays;

public class MinimumFlipsForBinaryArrayToMakeItUniform {

    public static void main(String[] args) {
        int [] arr = {1,1,0,0,0,1,1,1,0,0,1};
        minimumFlipsIndex(arr);

        int [] arr1 = {1,1,1,0};
        minimumFlipsIndex(arr1);
    }

    private static void minimumFlipsIndex(int [] arr) {
        int start = 0, end = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1] && arr[i] != arr[0]) {
                start = i;
            }
            if(arr[i] != arr[i-1] && arr[i] == arr[0]) {
                end = i-1;
                System.out.println(" FROM " + start + " To " + end);
                start = 0;
            }
        }
        if(end == 0) {
            System.out.println(" FROM " + end + " To " + (start-1));
        }
    }
}
