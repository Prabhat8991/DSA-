package matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MatrixBoundaryTraversal {
    public static void main(String[] args) {
      int[][] inputArray = {{5, 11, 30}, {5, 19, 19}};
        for (int i: boundaryTraversal(inputArray,2,3)) {
          System.out.print(i);
        }
    }
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> resultArrayList = new ArrayList<Integer>();
        if(n == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                resultArrayList.add(matrix[0][i]);
            }
        } else if(m == 1) {
            for (int i = 0; i < matrix.length; i++) {
                resultArrayList.add(matrix[i][0]);
            }
        } else {
            for (int j = 0; j < matrix[0].length; j++) {
                resultArrayList.add(matrix[0][j]);
            }

            for (int i = 1; i < matrix.length; i++) {
                resultArrayList.add(matrix[i][matrix[i].length - 1]);
            }

            for (int j = matrix[matrix.length-1].length - 2; j >= 0; j--) {
                resultArrayList.add(matrix[matrix.length - 1][j]);
            }

            for (int i = matrix.length - 2; i > 0; i--) {
                resultArrayList.add(matrix[i][0]);
            }
        }
        return resultArrayList;
    }
}
