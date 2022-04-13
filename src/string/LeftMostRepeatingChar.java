package string;

import java.util.Arrays;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
     String inputString = "zeeksforgeeks";
     System.out.print(getLeftMostRepeatingCharWithBooleanArray(inputString));
     }

    private static int getLeftMostRepeatingCharWithDoubleTraverse(String inputString) {

        int [] resultArray = new int[256];

        for(int i = 0; i < inputString.length(); i++) {
            resultArray[inputString.charAt(i)]++;
        }

        for(int i = 0; i < inputString.length(); i++) {
            if(resultArray[inputString.charAt(i)] > 1) {
                return i;
            }
        }

        return -1;
    }

    private static int getLeftMostRepeatingCharWithSingleTraverse(String inputString) {
        int [] resultArray = new int[256];
        Arrays.fill(resultArray, -1);
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < inputString.length(); i++) {
            int charIndexValue = resultArray[inputString.charAt(i)];
            if(charIndexValue == -1) {
                resultArray[inputString.charAt(i)] = i;
            } else {
                res = Math.min(res, charIndexValue);
            }
        }
        return (res == Integer.MAX_VALUE)? -1: res;
    }

    private static int getLeftMostRepeatingCharWithBooleanArray(String inputString) {
        boolean [] visitedArray = new boolean[256];

        int res = -1;

        for(int i = inputString.length()-1; i >= 0; i--) {
            if(visitedArray[inputString.charAt(i)]) {
                res = i;
            } else {
                visitedArray[inputString.charAt(i)] = true;
            }
        }
        return res;
    }
}
