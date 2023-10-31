package phase2.recursion.submissions;

import java.util.ArrayList;

public class PossibleCombinationOfPhoneKeyPad {

    public static void main(String[] args) {
        int [] inputArray = {2,3};
        ArrayList<String> result = possibleWords(inputArray, 2);
        for (String s: result) {
            System.out.print(s + " ");
        }
    }



    static ArrayList<String> possibleWords(int a[], int N)
    {
        ArrayList<String> resultArrayList = new ArrayList<>();
        StringBuilder resultString = new StringBuilder();
        String [] mapOfKeys = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int index = 0;
        solve(a, resultArrayList, resultString, mapOfKeys, index);
        return resultArrayList;
    }

    private static void solve(int [] inputArray, ArrayList<String> resultArrayList, StringBuilder resultString, String [] mapOfKeys, int index) {
        if (index >= inputArray.length) {
            resultArrayList.add(resultString.toString());
            return;
        }
        int keyPadNumber = inputArray[index];
        String keyPadString = mapOfKeys[keyPadNumber];

        for (int i = 0; i < keyPadString.length(); i++) {
            resultString.append(keyPadString.toCharArray()[i]);
            solve(inputArray, resultArrayList, resultString, mapOfKeys, index+1);
            resultString.deleteCharAt(index);
        }
    }


}
